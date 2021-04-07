package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\t"}, d2 = {"Lbr/com/zup/Clients;", "", "()V", "grpcRegistry", "Lbr/com/zup/KeymgrRegistryServiceGrpc$KeymgrRegistryServiceBlockingStub;", "channel", "Lio/grpc/ManagedChannel;", "grpcRemove", "Lbr/com/zup/KeymgrRemoveServiceGrpc$KeymgrRemoveServiceBlockingStub;", "keymgr"})
@io.micronaut.context.annotation.Factory()
public final class Clients {
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.context.annotation.Bean()
    public final br.com.zup.KeymgrRegistryServiceGrpc.KeymgrRegistryServiceBlockingStub grpcRegistry(@org.jetbrains.annotations.NotNull()
    @io.micronaut.grpc.annotation.GrpcChannel(value = "grpc-server")
    io.grpc.ManagedChannel channel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.context.annotation.Bean()
    public final br.com.zup.KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub grpcRemove(@org.jetbrains.annotations.NotNull()
    @io.micronaut.grpc.annotation.GrpcChannel(value = "grpc-server")
    io.grpc.ManagedChannel channel) {
        return null;
    }
    
    public Clients() {
        super();
    }
}