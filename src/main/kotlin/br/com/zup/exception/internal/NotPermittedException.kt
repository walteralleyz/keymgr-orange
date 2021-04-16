package br.com.zup.exception.internal

import io.grpc.Status

class NotPermittedException(message: String) : RuntimeException(message), ApplicationException {
    override val status: Status = Status.PERMISSION_DENIED
}
