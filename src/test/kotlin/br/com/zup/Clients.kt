package br.com.zup

import io.grpc.ManagedChannel
import io.micronaut.context.annotation.Bean
import io.micronaut.context.annotation.Factory
import io.micronaut.grpc.annotation.GrpcChannel
import io.micronaut.grpc.server.GrpcServerChannel

@Factory
class Clients {
    @Bean
    fun grpcClient(
        @GrpcChannel(GrpcServerChannel.NAME) channel: ManagedChannel
    ): KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub {
        return KeymgrRegistryServiceGrpc.newBlockingStub(channel)
    }
}