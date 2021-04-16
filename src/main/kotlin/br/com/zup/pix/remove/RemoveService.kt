package br.com.zup.pix.remove

import br.com.zup.KeymgrExcludeResponse
import br.com.zup.bcb.BCBClient
import br.com.zup.bcb.remove.convertToBCBRemoveRequest
import br.com.zup.repository.PixRepository
import io.micronaut.validation.Validated
import javax.inject.Singleton
import javax.validation.Valid

import br.com.zup.exception.internal.NotFoundException
import br.com.zup.exception.internal.NotPermittedException

@Validated
@Singleton
class RemoveService(
    private val repo: PixRepository,
    private val bcbClient: BCBClient,
) {

    fun delete(@Valid req: RemoveValidatedRequest): KeymgrExcludeResponse {
        val pix = repo.findByPixAndClient(req.pix, req.clientId) ?: throw NotPermittedException("Chave pix não encontrada para usuário")

        bcbClient.remove(pix.pix, convertToBCBRemoveRequest(pix))?.let {
            it.body.orElseThrow { NotFoundException("Não foi possivel remover essa chave dos nossos registros") }
        }

        repo.remove(pix.pix)
        return req.toResponse()
    }
}