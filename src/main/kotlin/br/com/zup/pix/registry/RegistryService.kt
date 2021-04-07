package br.com.zup.pix.registry

import br.com.zup.KeymgrRegistryResponse
import br.com.zup.account.AccountClient
import br.com.zup.exception.internal.NotFoundException
import br.com.zup.repository.PixRepository
import io.micronaut.validation.Validated
import javax.inject.Singleton
import javax.validation.Valid

@Validated
@Singleton
class RegistryService(
    private val repository: PixRepository,
    private val client: AccountClient
) {

    fun create(@Valid req: RegistryValidatedRequest): KeymgrRegistryResponse {
        return try {
            client.getById(req.clientId) ?: throw NotFoundException("Cliente não encontrado")

            repository.save(req.toModel()).toResponse()
        } catch (e: Exception) { throw NotFoundException("Cliente não encontrado") }
    }
}