package br.com.zup.exception.internal

import io.grpc.Status

class RequestException(message: String) : RuntimeException(message), ApplicationException {
    override val status: Status = Status.ABORTED
}
