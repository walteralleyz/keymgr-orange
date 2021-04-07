package br.com.zup.pix;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lbr/com/zup/pix/RemoveEndpointTest;", "", "grpcRemove", "Lbr/com/zup/KeymgrRemoveServiceGrpc$KeymgrRemoveServiceBlockingStub;", "manager", "Ljavax/persistence/EntityManager;", "transactional", "Lio/micronaut/transaction/SynchronousTransactionManager;", "Ljava/sql/Connection;", "(Lbr/com/zup/KeymgrRemoveServiceGrpc$KeymgrRemoveServiceBlockingStub;Ljavax/persistence/EntityManager;Lio/micronaut/transaction/SynchronousTransactionManager;)V", "setup", "", "should delete a registered pix key", "should throw an error with wrong pix", "keymgr"})
@io.micronaut.test.extensions.junit5.annotation.MicronautTest(transactional = false)
public final class RemoveEndpointTest {
    private final br.com.zup.KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub grpcRemove = null;
    private final javax.persistence.EntityManager manager = null;
    private final io.micronaut.transaction.SynchronousTransactionManager<java.sql.Connection> transactional = null;
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setup() {
    }
    
    public RemoveEndpointTest(@org.jetbrains.annotations.NotNull()
    br.com.zup.KeymgrRemoveServiceGrpc.KeymgrRemoveServiceBlockingStub grpcRemove, @org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager manager, @org.jetbrains.annotations.NotNull()
    io.micronaut.transaction.SynchronousTransactionManager<java.sql.Connection> transactional) {
        super();
    }
}