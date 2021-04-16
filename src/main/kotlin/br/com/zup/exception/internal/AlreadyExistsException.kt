package br.com.zup.exception.internal

import io.grpc.Status

class AlreadyExistsException(message: String) : RuntimeException(message), ApplicationException {
    override val status: Status = Status.ALREADY_EXISTS
}