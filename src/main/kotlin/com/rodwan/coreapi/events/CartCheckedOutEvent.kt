package com.rodwan.coreapi.events

import java.time.Instant

data class CartCheckedOutEvent(
    override val aggregateId: String,
    val totalAmount: Double,
    val itemCount: Int,
    val shippingAddress: String,
    val paymentMethod: String,
    override val timestamp: Instant = Instant.now(),
) : Event
