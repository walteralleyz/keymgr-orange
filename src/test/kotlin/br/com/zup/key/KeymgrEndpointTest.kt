package br.com.zup.key

import br.com.zup.AccountType
import br.com.zup.KeyType
import br.com.zup.KeymgrRegistryRequest
import br.com.zup.KeymgrRegistryServiceGrpc
import io.grpc.Status
import io.grpc.StatusRuntimeException
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import io.micronaut.transaction.SynchronousTransactionManager
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows
import java.sql.Connection
import javax.persistence.EntityManager

@MicronautTest(transactional = false)
class KeymgrEndpointTest(
    private val grpcClient: KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub,
    private val manager: EntityManager,
    private val transactional: SynchronousTransactionManager<Connection>
) {

    @Test
    fun `should registry a new key`() {
        grpcClient.registry(KeymgrRegistryRequest.newBuilder()
            .setPix("54555658451")
            .setPixType(KeyType.CPF)
            .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
            .setAccountType(AccountType.CORRENTE)
            .build()
        ).let {
            with(it) {
                assertNotNull(pixId)
            }
        }

        transactional.executeRead {
            manager.createQuery("from Key", Key::class.java)
                .resultList
        }.let {
            assertEquals(it[0].pixKeyId, "54555658451")
            assertEquals(it.size, 1)
        }
    }

    @Test
    fun `should not registry the same pix key`() {
        assertThrows<StatusRuntimeException> {
            grpcClient.registry(KeymgrRegistryRequest.newBuilder()
                .setPix("54555658451")
                .setPixType(KeyType.CPF)
                .setClientId("c56dfef4-7901-44fb-84e2-a2cefb157890")
                .setAccountType(AccountType.CORRENTE)
                .build()
            )
        }.let {
            assertEquals(Status.ALREADY_EXISTS.code, it.status.code)
            assertEquals("Chave já foi registrada", it.status.description)
        }
    }

    @Test
    fun `should not registry a key with wrong client id`() {
        assertThrows<StatusRuntimeException> {
            grpcClient.registry(KeymgrRegistryRequest.newBuilder()
                .setPix("56482421325")
                .setPixType(KeyType.CPF)
                .setClientId("adsfsdfsdf")
                .setAccountType(AccountType.CORRENTE)
                .build()
            )
        }.let {
            assertEquals(Status.NOT_FOUND.code, it.status.code)
            assertEquals("Cliente não encontrado", it.status.description)
        }
    }
}