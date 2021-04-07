package br.com.zup.utils

import br.com.zup.KeymgrRegistryRequest
import br.com.zup.annotation.UniqueElement
import br.com.zup.key.KeyValidatedRequest
import io.micronaut.core.annotation.AnnotationValue

fun KeymgrRegistryRequest.toValidatedEntity(): KeyValidatedRequest = KeyValidatedRequest(
    this.pix,
    this.pixType,
    this.clientId,
    this.accountType
)

fun AnnotationValue<UniqueElement>.valOf(value: String) = this.stringValue(value).get()