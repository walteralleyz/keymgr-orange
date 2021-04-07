package br.com.zup.key

import br.com.zup.KeymgrRegistryResponse
import br.com.zup.account.AccountClient
import br.com.zup.account.AccountNotFoundException
import br.com.zup.repository.KeyRepository
import io.micronaut.validation.Validated
import javax.inject.Singleton
import javax.validation.Valid

@Validated
@Singleton
class KeymgrService(
    private val repository: KeyRepository,
    private val client: AccountClient
) {

    fun create(@Valid req: KeyValidatedRequest): KeymgrRegistryResponse {
//        repository.findForPix(req.pix)?.let { throw KeyAlreadyExistsException("Chave pix já existe") }

        return try {
            client.getById(req.clientId)
            repository.save(req.toModel()).toResponse()
        } catch (e: Exception) { throw AccountNotFoundException("Cliente não encontrado") }
    }
}