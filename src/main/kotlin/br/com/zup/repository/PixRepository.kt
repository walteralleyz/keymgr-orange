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
        return transactionManager.executeWrite { entityManager.merge(pix) }
    }

    fun findForPix(pix: String): Pix? {
        return transactionManager.executeRead {
            try {
                entityManager.createQuery(
                    "from Pix p where p.pix = :id",
                    Pix::class.java
                ).setParameter("id", pix).singleResult
            } catch (e: NoResultException) { null }
        }
    }

    fun findForPixId(id: Int): Pix? {
        return transactionManager.executeRead {
            try {
                entityManager.createQuery(
                    "from Pix p where p.id = :id",
                    Pix::class.java
                ).setParameter("id", id).singleResult
            } catch (e: NoResultException) { null }
        }
    }

    fun remove(pix: String) {
        transactionManager.executeWrite {
            entityManager.createQuery("delete from Pix p where p.pix = :pix")
                .setParameter("pix", pix)
                .executeUpdate()
        }
    }
}