package br.com.zup.pix.remove

import br.com.zup.KeymgrExcludeResponse
import br.com.zup.repository.PixRepository
import io.micronaut.validation.Validated
import javax.inject.Singleton
import javax.validation.Valid

@Validated
@Singleton
class RemoveService(
    private val repository: PixRepository
) {

    fun delete(@Valid req: RemoveValidatedRequest): KeymgrExcludeResponse {
        repository.remove(req.pixId)

        return req.toResponse()
    }
}