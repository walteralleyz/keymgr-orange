package br.com.zup.exception.handler

import br.com.zup.exception.ExceptionHandler
import br.com.zup.key.KeyAlreadyExistsException
import io.grpc.Status
import javax.inject.Singleton

@Singleton
class KeyAlreadyExistsExceptionHandler : ExceptionHandler<KeyAlreadyExistsException> {
    override fun handle(e: KeyAlreadyExistsException): ExceptionHandler.StatusWithDetails {
        return ExceptionHandler.StatusWithDetails(
            Status.ALREADY_EXISTS
                .withDescription(e.message)
                .withCause(e)
        )
    }

    override fun supports(e: Exception): Boolean {
        return e is KeyAlreadyExistsException
    }

}