package com.rodwan.coreapi.events

import java.time.Instant

data class CartClearedEvent(
    override val aggregateId: String,
    override val timestamp: Instant = Instant.now(),
) : Event
