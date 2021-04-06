package br.com.zup.key

import br.com.zup.AccountType
import br.com.zup.KeyType
import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Introspected
data class KeyValidatedRequest(
    @field:Size(max = 77)
    val pix: String,

    @field:NotNull
    val pixType: KeyType,

    @field:NotBlank
    val clientId: String,

    @field:NotNull
    val accountType: AccountType
) {
    fun toModel(): Key {
        val pixKey = if(pix.isBlank() && pixType == KeyType.UUID)
            UUID.randomUUID().toString()
        else pix

        return Key(
            pixKey,
            pixType,
            clientId,
            accountType
        )
    }
}