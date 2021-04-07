package br.com.zup.annotation

import br.com.zup.key.KeyAlreadyExistsException
import br.com.zup.utils.valOf
import io.micronaut.context.annotation.Factory
import io.micronaut.transaction.SynchronousTransactionManager
import io.micronaut.validation.validator.constraints.ConstraintValidator
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

@Factory
class Validation(
    private val manager: EntityManager,
    private val transactional: SynchronousTransactionManager<Connection>
) {

    @Singleton
    fun unique(): ConstraintValidator<UniqueElement, Any> {
        return ConstraintValidator { value, ann, _ ->
            with(ann) {
                transactional.executeRead {
                    try {
                        manager.createQuery(
                            "from ${valOf("domain")} k where k.${valOf("fieldName")} = :value")
                            .setParameter("value", value)
                            .singleResult
                        throw KeyAlreadyExistsException(valOf("message"))
                    } catch (e: NoResultException) { true }
                }
            }
        }
    }
}