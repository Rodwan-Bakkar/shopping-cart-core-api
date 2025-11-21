package com.rodwan.coreapi.commands

import java.time.Instant
import java.util.UUID

data class ClearCartCommand(
    override val commandId: UUID = UUID.randomUUID(),
    override val timestamp: Instant = Instant.now(),
) : Command
