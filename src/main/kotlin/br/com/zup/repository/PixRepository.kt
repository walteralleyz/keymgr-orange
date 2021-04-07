package br.com.zup.repository

import br.com.zup.exception.internal.NotFoundException
import br.com.zup.pix.Pix
import io.micronaut.data.annotation.Repository
import io.micronaut.transaction.SynchronousTransactionManager
import java.sql.Connection
import javax.persistence.EntityManager
import javax.persistence.NoResultException

@Repository
open class PixRepository(
    private val entityManager: EntityManager,
    private val transactionManager: SynchronousTransactionManager<Connection>
) {
    fun save(pix: Pix): Pix {
        return transactionManager.executeWrite {
            entityManager.persist(pix)
            pix
        }
    }

    fun findForPix(pixId: String): Pix? {
        return transactionManager.executeRead {
            try {
                entityManager.createQuery(
                    "from Pix where pixKeyId = :id",
                    Pix::class.java
                ).setParameter("id", pixId).singleResult
            } catch (e: NoResultException) { null }
        }
    }

    fun remove(pixId: String) {
        transactionManager.executeWrite {
            entityManager.createQuery("delete from Pix where pixKeyId = :pix")
                .setParameter("pix", pixId)
                .executeUpdate()
        }
    }
}