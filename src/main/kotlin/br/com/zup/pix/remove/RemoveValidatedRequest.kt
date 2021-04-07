package br.com.zup.pix.remove

import br.com.zup.KeymgrExcludeResponse
import br.com.zup.annotation.PixAndClient
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
@PixAndClient(message = "Chave pix com o cliente, não encontrada", domain = "Pix")
data class RemoveValidatedRequest(
    @NotBlank
    @Size(max = 77)
    val pixId: String,

    @NotBlank
    val clientId: String
) {
    fun toResponse() = KeymgrExcludeResponse.newBuilder()
        .setPixId(pixId)
        .setClientId(clientId)
        .build()
}
