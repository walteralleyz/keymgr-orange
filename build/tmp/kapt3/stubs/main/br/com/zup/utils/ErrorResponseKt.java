package br.com.zup.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a8\u0006\f"}, d2 = {"errorResponse", "", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/KeymgrRegistryResponse;", "message", "", "status", "Lio/grpc/Status;", "isPixResponseValid", "", "pixId", "keymgr"})
public final class ErrorResponseKt {
    
    public static final boolean isPixResponseValid(@org.jetbrains.annotations.NotNull()
    java.lang.String pixId, @org.jetbrains.annotations.NotNull()
    io.grpc.stub.StreamObserver<br.com.zup.KeymgrRegistryResponse> responseObserver) {
        return false;
    }
    
    public static final void errorResponse(@org.jetbrains.annotations.NotNull()
    io.grpc.stub.StreamObserver<br.com.zup.KeymgrRegistryResponse> responseObserver, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    io.grpc.Status status) {
    }
}