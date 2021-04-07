package br.com.zup.annotation

import io.micronaut.core.annotation.AnnotationValue
import io.micronaut.transaction.SynchronousTransactionManager
import io.micronaut.validation.validator.constraints.ConstraintValidator
import io.micronaut.validation.validator.constraints.ConstraintValidatorContext
import java.sql.Connection
import javax.inject.Singleton
import javax.persistence.EntityManager
import javax.persistence.NoResultException
import javax.validation.Constraint
import javax.validation.ReportAsSingleViolation
import kotlin.annotation.AnnotationTarget.*
import kotlin.annotation.AnnotationRetention.RUNTIME

@ReportAsSingleViolation
@Constraint(validatedBy = [])
@Retention(RUNTIME)
@Target(FIELD, CONSTRUCTOR, PROPERTY, VALUE_PARAMETER)
annotation class UniqueElement(
    val message: String = "Message default",
    val domain: String,
    val fieldName: String
)


@Singleton
class UniqueElementValidator(
    private val manager: EntityManager,
    private val transactional: SynchronousTransactionManager<Connection>
) : ConstraintValidator<UniqueElement, Any> {
    override fun isValid(
        value: Any?,
        annotationMetadata: AnnotationValue<UniqueElement>,
        context: ConstraintValidatorContext
    ): Boolean {
        val domain = annotationMetadata.stringValue("domain").get()
        val field = annotationMetadata.stringValue("fieldName").get()

        return transactional.executeRead {
            try {
                manager.createQuery("select k from $domain k where k.$field = :value")
                    .setParameter("value", value)
                    .singleResult
                false
            } catch (e: NoResultException) { true }
        }
    }
}