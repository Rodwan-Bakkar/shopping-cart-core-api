package com.rodwan.coreapi.events

import java.time.Instant

data class CartCreatedEvent(
    override val aggregateId: String,
    val userId: String,
    override val timestamp: Instant = Instant.now(),
) : Event
