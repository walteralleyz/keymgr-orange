package br.com.zup.pix.registry

import br.com.zup.AccountType
import br.com.zup.KeyType
import br.com.zup.annotation.UniqueElement
import br.com.zup.pix.Pix
import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Introspected
data class RegistryValidatedRequest(
    @field:Size(max = 77)
    @field:UniqueElement(message = "Chave já foi registrada", domain = "Pix", fieldName = "pixKeyId")
    val pix: String,

    @field:NotNull
    val pixType: KeyType,

    @field:NotBlank
    val clientId: String,

    @field:NotNull
    val accountType: AccountType
) {
    fun toModel(): Pix {
        val pixKey = if(pix.isBlank() && pixType == KeyType.UUID)
            UUID.randomUUID().toString()
        else pix

        return Pix(
            pixKey,
            pixType,
            clientId,
            accountType
        )
    }
}