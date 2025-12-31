package com.rodwan.coreapi.events

import java.math.BigDecimal
import java.time.Instant

data class CartCheckedOutEvent(
    override val aggregateId: String,
    val totalAmount: BigDecimal,
    val itemCount: Int,
    val shippingAddress: String,
    val paymentMethod: String,
    override val timestamp: Instant = Instant.now(),
) : Event
