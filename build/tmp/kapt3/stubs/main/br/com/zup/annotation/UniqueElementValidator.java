package br.com.zup.annotation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ(\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lbr/com/zup/annotation/UniqueElementValidator;", "Lio/micronaut/validation/validator/constraints/ConstraintValidator;", "Lbr/com/zup/annotation/UniqueElement;", "", "manager", "Ljavax/persistence/EntityManager;", "transactional", "Lio/micronaut/transaction/SynchronousTransactionManager;", "Ljava/sql/Connection;", "(Ljavax/persistence/EntityManager;Lio/micronaut/transaction/SynchronousTransactionManager;)V", "isValid", "", "value", "annotationMetadata", "Lio/micronaut/core/annotation/AnnotationValue;", "context", "Lio/micronaut/validation/validator/constraints/ConstraintValidatorContext;", "keymgr"})
@javax.inject.Singleton()
public final class UniqueElementValidator implements io.micronaut.validation.validator.constraints.ConstraintValidator<br.com.zup.annotation.UniqueElement, java.lang.Object> {
    private final javax.persistence.EntityManager manager = null;
    private final io.micronaut.transaction.SynchronousTransactionManager<java.sql.Connection> transactional = null;
    
    @java.lang.Override()
    public boolean isValid(@org.jetbrains.annotations.Nullable()
    java.lang.Object value, @org.jetbrains.annotations.NotNull()
    io.micronaut.core.annotation.AnnotationValue<br.com.zup.annotation.UniqueElement> annotationMetadata, @org.jetbrains.annotations.NotNull()
    io.micronaut.validation.validator.constraints.ConstraintValidatorContext context) {
        return false;
    }
    
    public UniqueElementValidator(@org.jetbrains.annotations.NotNull()
    javax.persistence.EntityManager manager, @org.jetbrains.annotations.NotNull()
    io.micronaut.transaction.SynchronousTransactionManager<java.sql.Connection> transactional) {
        super();
    }
}