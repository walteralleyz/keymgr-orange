package br.com.zup.key;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lbr/com/zup/key/KeymgrEndpoint;", "Lbr/com/zup/KeymgrRegistryServiceGrpc$KeymgrRegistryServiceImplBase;", "service", "Lbr/com/zup/key/KeymgrService;", "(Lbr/com/zup/key/KeymgrService;)V", "registry", "", "req", "Lbr/com/zup/KeymgrRegistryRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/zup/KeymgrRegistryResponse;", "keymgr"})
@javax.inject.Singleton()
@br.com.zup.exception.ErrorHandler()
public class KeymgrEndpoint extends br.com.zup.KeymgrRegistryServiceGrpc.KeymgrRegistryServiceImplBase {
    private final br.com.zup.key.KeymgrService service = null;
    
    @java.lang.Override()
    public void registry(@org.jetbrains.annotations.Nullable()
    br.com.zup.KeymgrRegistryRequest req, @org.jetbrains.annotations.Nullable()
    io.grpc.stub.StreamObserver<br.com.zup.KeymgrRegistryResponse> responseObserver) {
    }
    
    public KeymgrEndpoint(@org.jetbrains.annotations.NotNull()
    br.com.zup.key.KeymgrService service) {
        super();
    }
}