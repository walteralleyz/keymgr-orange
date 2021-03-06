package br.com.zup.pix.remove

import br.com.zup.KeymgrExcludeRequest
import br.com.zup.KeymgrExcludeResponse
import br.com.zup.KeymgrRemoveServiceGrpc
import br.com.zup.exception.ErrorHandler
import br.com.zup.exception.internal.RequestException
import br.com.zup.utils.toValidatedEntity
import io.grpc.stub.StreamObserver
import javax.inject.Singleton

@ErrorHandler
@Singleton
class RemoveEndpoint(private val service: RemoveService) : KeymgrRemoveServiceGrpc.KeymgrRemoveServiceImplBase() {
    override fun remove(request: KeymgrExcludeRequest, responseObserver: StreamObserver<KeymgrExcludeResponse>) {
        if(request.clientId.isNullOrBlank() || request.pix.isNullOrBlank()) throw RequestException(
            "Todos os dados devem ser preenchidos"
        )

        service.delete(request.toValidatedEntity()).let {
            responseObserver.onNext(it)
        }

        responseObserver.onCompleted()
    }
}