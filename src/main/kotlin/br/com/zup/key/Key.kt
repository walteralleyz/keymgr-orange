package br.com.zup.key

import br.com.zup.*
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "keys")
class Key(
    @Column(unique = true)
    val pixKeyId: String,

    @Enumerated(EnumType.STRING)
    val pixKeyType: KeyType,

    val clientId: String,

    @Enumerated(EnumType.STRING)
    val accountType: AccountType
) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    
    fun toResponse(): KeymgrRegistryResponse = KeymgrRegistryResponse.newBuilder().setPixId(pixKeyId).build()
}

fun convertToKeyEntity(request: KeymgrRegistryRequest): Key {
    val pixKey = if(request.pix.isNullOrBlank() && request.pixType == KeyType.UUID)
        UUID.randomUUID().toString()
    else request.pix

    return Key(
        pixKey,
        request.pixType,
        request.clientId,
        request.accountType
    )
}