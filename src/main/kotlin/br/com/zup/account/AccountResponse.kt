package br.com.zup.account

data class AccountResponse(
    val id: String,
    val nome: String,
    val cpf: String,
    val instituicao: AccountBank
)