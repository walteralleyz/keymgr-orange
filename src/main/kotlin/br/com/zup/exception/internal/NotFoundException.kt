package br.com.zup.exception.internal

import io.grpc.Status

class NotFoundException(message: String) : RuntimeException(message), ApplicationException {
    override val status: Status = Status.NOT_FOUND
}