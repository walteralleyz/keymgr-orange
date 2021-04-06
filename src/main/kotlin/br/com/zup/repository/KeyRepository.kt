package br.com.zup.repository

import br.com.zup.key.Key
import io.micronaut.data.annotation.Repository
import io.micronaut.transaction.SynchronousTransactionManager
import java.sql.Connection
import javax.persistence.EntityManager
import javax.persistence.NoResultException

@Repository
open class KeyRepository(
    private val entityManager: EntityManager,
    private val transactionManager: SynchronousTransactionManager<Connection>
) {
    fun save(key: Key): Key {
        return transactionManager.executeWrite {
            entityManager.persist(key)
            key
        }
    }

    fun findForPix(pixId: String): Key? {
        return transactionManager.executeRead {
            try {
                entityManager.createQuery(
                    "from Key where pixKeyId = :id",
                    Key::class.java
                ).setParameter("id", pixId).singleResult
            } catch (e: NoResultException) { null }
        }
    }
}