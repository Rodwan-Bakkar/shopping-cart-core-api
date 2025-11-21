package com.rodwan.coreapi.dtos

import java.time.Instant

// Command Response (for write operations)
data class CommandResponse(
    val success: Boolean,
    val message: String,
    val cartId: String,
    val timestamp: Instant = Instant.now(),
)
