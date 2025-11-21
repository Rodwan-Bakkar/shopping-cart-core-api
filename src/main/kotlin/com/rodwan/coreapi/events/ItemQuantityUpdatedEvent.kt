package com.rodwan.coreapi.events

import java.time.Instant

data class ItemQuantityUpdatedEvent(
    override val aggregateId: String,
    val productId: String,
    val oldQuantity: Int,
    val newQuantity: Int,
    override val timestamp: Instant = Instant.now(),
) : Event
