package com.rodwan.coreapi.events

import java.time.Instant

data class ItemRemovedEvent(
    override val aggregateId: String,
    val productId: String,
    override val timestamp: Instant = Instant.now(),
) : Event
