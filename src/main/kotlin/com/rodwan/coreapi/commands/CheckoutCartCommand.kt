package com.rodwan.coreapi.commands

import java.time.Instant
import java.util.UUID

data class CheckoutCartCommand(
    val shippingAddress: String,
    val paymentMethod: String,
    override val commandId: UUID = UUID.randomUUID(),
    override val timestamp: Instant = Instant.now(),
) : Command {
    init {
        require(shippingAddress.isNotBlank()) { "Shipping address cannot be blank" }
        require(paymentMethod.isNotBlank()) { "Payment method cannot be blank" }
    }
}
