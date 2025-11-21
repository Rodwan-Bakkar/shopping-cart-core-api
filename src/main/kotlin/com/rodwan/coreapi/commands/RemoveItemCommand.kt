package com.rodwan.coreapi.commands

import java.time.Instant
import java.util.UUID

data class RemoveItemCommand(
    val productId: String,
    override val commandId: UUID = UUID.randomUUID(),
    override val timestamp: Instant = Instant.now(),
) : Command {
    init {
        require(productId.isNotBlank()) { "Product ID cannot be blank" }
    }
}
