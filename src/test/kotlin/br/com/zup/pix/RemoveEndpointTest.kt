package br.com.zup.pix

import br.com.zup.AccountType
import br.com.zup.KeyType
import br.com.zup.KeymgrExcludeRequest
import br.com.zup.KeymgrRemoveServiceGrpc
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.micronaut.transaction.SynchronousTransactionManager
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.sql.Connection
import javax.persistence.EntityManager

@MicronautTest(transactional = false)
class RemoveEndpointTest(
    private val grpcRemove: KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub,
    private val manager: EntityManager,
    private val transactional: SynchronousTransactionManager<Connection>
) {

    @BeforeEach
    fun setup() {
        transactional.executeWrite {
            manager.persist(Pix(
                "54555658451",
                KeyType.CPF,
                "c56dfef4-7901-44fb-84e2-a2cefb157890",
                AccountType.CORRENTE
            ))
        }
    }

    @Test
    fun `should delete a registered pix key`() {
        grpcRemove.exclude(KeymgrExcludeRequest.newBuilder()
            .setPixId("54555658451")
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .build()
        )

        transactional.executeRead {
            manager.createQuery("from Pix where pixKeyId = :pix", Pix::class.java)
                .setParameter("pix", "54555658451").resultList
        }.let {
            assertEquals(0, it.size)
        }
    }

    @Test
    fun `should throw an error with wrong pix`() {
        assertThrows<StatusRuntimeException> {
            grpcRemove.exclude(KeymgrExcludeRequest.newBuilder()
                .setPixId("12341234214")
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .build()
            )
        }.let {
            assertEquals(Status.NOT_FOUND.code, it.status.code)
            assertEquals("Chave pix com o cliente, não encontrada", it.status.description)
        }
    }
}