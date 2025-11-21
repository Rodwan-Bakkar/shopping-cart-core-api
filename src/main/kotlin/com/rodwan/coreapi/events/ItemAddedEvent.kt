package com.rodwan.coreapi.events

import java.time.Instant

data class ItemAddedEvent(
    override val aggregateId: String,
    val productId: String,
    val productName: String,
    val price: Double,
    val quantity: Int,
    override val timestamp: Instant = Instant.now(),
) : Event
