package br.com.zup.exception

import io.grpc.BindableService
import io.grpc.stub.StreamObserver
import io.micronaut.aop.Around
import io.micronaut.aop.MethodInterceptor
import io.micronaut.aop.MethodInvocationContext
import io.micronaut.context.annotation.Type
import javax.inject.Singleton
import kotlin.annotation.AnnotationTarget.*

@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
@Target(CLASS, FILE, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER)
@Around
@Type(ExceptionHandlerInterceptor::class)
annotation class ErrorHandler()

@Singleton
class ExceptionHandlerInterceptor : MethodInterceptor<BindableService, Any?> {

    override fun intercept(context: MethodInvocationContext<BindableService, Any?>): Any? {
        return try { context.proceed() }
        catch (e: Exception) {
            handleException(e)
                .let { responseObserver(context).onError(convertStatusToRuntime(it)) }

            null
        }
    }

    fun responseObserver(context: MethodInvocationContext<BindableService, Any?>): StreamObserver<*> {
        return context.parameterValues[1] as StreamObserver<*>
    }
}