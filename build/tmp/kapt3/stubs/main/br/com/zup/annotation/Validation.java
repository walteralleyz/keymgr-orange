package br.com.zup.annotation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lbr/com/zup/annotation/Validation;", "", "manager", "Ljavax/persistence/EntityManager;", "transactional", "Lio/micronaut/transaction/SynchronousTransactionManager;", "Ljava/sql/Connection;", "(Ljavax/persistence/EntityManager;Lio/micronaut/transaction/SynchronousTransactionManager;)V", "unique", "Lio/micronaut/validation/validator/constraints/ConstraintValidator;", "Lbr/com/zup/annotation/UniqueElement;", "keymgr"})
@io.micronaut.context.annotation.Factory()
public final class Validation {
    private final javax.persistence.EntityManager manager = null;
    private final io.micronaut.transaction.SynchronousTransactionManager<java.sql.Connection> transactional = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    public final io.micronaut.validation.validator.constraints.ConstraintValidator<br.com.zup.annotation.UniqueElement, java.lang.Object> unique() {
        return null;
    }
    
    public Validation(@org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager manager, @org.jetbrains.annotations.NotNull()
    io.micronaut.transaction.SynchronousTransactionManager<java.sql.Connection> transactional) {
        super();
    }
}