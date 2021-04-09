package br.com.zup.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbr/com/zup/repository/PixRepository;", "", "entityManager", "Ljavax/persistence/EntityManager;", "transactionManager", "Lio/micronaut/transaction/SynchronousTransactionManager;", "Ljava/sql/Connection;", "(Ljavax/persistence/EntityManager;Lio/micronaut/transaction/SynchronousTransactionManager;)V", "findForPix", "Lbr/com/zup/pix/Pix;", "pix", "", "findForPixId", "id", "", "remove", "", "save", "keymgr"})
@io.micronaut.data.annotation.Repository()
public class PixRepository {
    private final javax.persistence.EntityManager entityManager = null;
    private final io.micronaut.transaction.SynchronousTransactionManager<java.sql.Connection> transactionManager = null;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.pix.Pix save(@org.jetbrains.annotations.NotNull()
    br.com.zup.pix.Pix pix) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final br.com.zup.pix.Pix findForPix(@org.jetbrains.annotations.NotNull()
    java.lang.String pix) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final br.com.zup.pix.Pix findForPixId(int id) {
        return null;
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String pix) {
    }
    
    public PixRepository(@org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager entityManager, @org.jetbrains.annotations.NotNull()
    io.micronaut.transaction.SynchronousTransactionManager<java.sql.Connection> transactionManager) {
        super();
    }
}