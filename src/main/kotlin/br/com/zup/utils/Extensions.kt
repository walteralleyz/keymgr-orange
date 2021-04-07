package br.com.zup.utils

import br.com.zup.KeymgrExcludeRequest
import br.com.zup.KeymgrRegistryRequest
import br.com.zup.annotation.UniqueElement
import br.com.zup.pix.registry.RegistryValidatedRequest
import br.com.zup.pix.remove.RemoveValidatedRequest
import io.micronaut.core.annotation.AnnotationValue

fun KeymgrRegistryRequest.toValidatedEntity(): RegistryValidatedRequest = RegistryValidatedRequest(
    this.pix,
    this.pixType,
    this.clientId,
    this.accountType
)

fun KeymgrExcludeRequest.toValidatedEntity(): RemoveValidatedRequest = RemoveValidatedRequest(
    this.pixId,
    this.clientId
)

fun AnnotationValue<*>.valOf(value: String) = this.stringValue(value).get()