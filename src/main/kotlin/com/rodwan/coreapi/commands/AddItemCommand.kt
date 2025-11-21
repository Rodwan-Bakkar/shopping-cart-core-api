package com.rodwan.coreapi.commands

import java.time.Instant
import java.util.UUID

data class AddItemCommand(
    val productId: String,
    val productName: String,
    val price: Double,
    val quantity: Int,
    override val commandId: UUID = UUID.randomUUID(),
    override val timestamp: Instant = Instant.now(),
) : Command {
    init {
        require(quantity > 0) { "Quantity must be positive" }
        require(price >= 0) { "Price cannot be negative" }
        require(productName.isNotBlank()) { "Product name cannot be blank" }
    }
}
