package br.com.zup.exception

import br.com.zup.exception.internal.ApplicationException
import io.grpc.Metadata
import io.grpc.Status
import io.grpc.StatusRuntimeException
import javax.validation.ConstraintViolationException

fun handleException(e: Exception): Status {
    return when (e) {
        is IllegalArgumentException -> Status.INVALID_ARGUMENT.withDescription(e.message)
        is IllegalStateException -> Status.FAILED_PRECONDITION.withDescription(e.message)
        is ConstraintViolationException -> Status.INVALID_ARGUMENT.withDescription(e.message)
        is ApplicationException -> e.status.withDescription(e.message)
        else -> Status.UNKNOWN.withDescription(e.message)
    }.withCause(e)
}

fun convertStatusToRuntime(status: Status): StatusRuntimeException = status.asRuntimeException(Metadata())