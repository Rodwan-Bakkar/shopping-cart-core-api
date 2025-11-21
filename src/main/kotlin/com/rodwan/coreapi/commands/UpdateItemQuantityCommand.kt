package com.rodwan.coreapi.commands

import java.time.Instant
import java.util.UUID

data class UpdateItemQuantityCommand(
    val productId: String,
    val quantity: Int,
    override val commandId: UUID = UUID.randomUUID(),
    override val timestamp: Instant = Instant.now(),
) : Command {
    init {
        require(quantity > 0) { "Quantity must be positive" }
    }
}
