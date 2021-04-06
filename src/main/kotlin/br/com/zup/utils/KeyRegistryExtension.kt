package br.com.zup.utils

import br.com.zup.KeymgrRegistryRequest
import br.com.zup.key.KeyValidatedRequest

fun KeymgrRegistryRequest.toValidatedEntity(): KeyValidatedRequest = KeyValidatedRequest(
    this.pix,
    this.pixType,
    this.clientId,
    this.accountType
)