package br.com.zup.account

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.client.annotation.Client

@Client("http://localhost:9091/api/v1/clientes")
interface AccountClient {

    @Get("/{id}")
    fun getById(@PathVariable id: String): AccountResponse?
}