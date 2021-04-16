package br.com.zup.exception.internal

import io.grpc.Status

interface ApplicationException {
    val status: Status
}