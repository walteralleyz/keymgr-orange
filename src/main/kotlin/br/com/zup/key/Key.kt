package br.com.zup.key

import br.com.zup.*
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