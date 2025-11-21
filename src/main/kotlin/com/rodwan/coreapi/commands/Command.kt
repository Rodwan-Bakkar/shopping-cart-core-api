package com.rodwan.coreapi.commands

import java.time.Instant
import java.util.UUID

interface Command {
    val commandId: UUID
    val timestamp: Instant
}
