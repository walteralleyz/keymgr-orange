package br.com.zup.exception.handler

import br.com.zup.account.AccountNotFoundException
import br.com.zup.exception.ExceptionHandler
import io.grpc.Status
import javax.inject.Singleton

@Singleton
class AccountNotFoundExceptionHandler : ExceptionHandler<AccountNotFoundException> {
    override fun handle(e: AccountNotFoundException): ExceptionHandler.StatusWithDetails {
        return ExceptionHandler.StatusWithDetails(
            Status.NOT_FOUND
                .withDescription(e.message)
                .withCause(e)
        )
    }

    override fun supports(e: Exception): Boolean {
        return e is AccountNotFoundException
    }

}