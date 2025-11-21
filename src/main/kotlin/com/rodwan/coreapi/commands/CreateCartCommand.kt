package com.rodwan.coreapi.commands

import java.time.Instant
import java.util.UUID

data class CreateCartCommand(
    val cartId: String,
    val userId: String,
    override val commandId: UUID = UUID.randomUUID(),
    override val timestamp: Instant = Instant.now(),
) : Command
