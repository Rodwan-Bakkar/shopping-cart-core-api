package com.rodwan.coreapi.events

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import java.time.Instant

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "eventType",
)
@JsonSubTypes(
    JsonSubTypes.Type(value = CartCreatedEvent::class, name = "CartCreated"),
    JsonSubTypes.Type(value = ItemAddedEvent::class, name = "ItemAdded"),
    JsonSubTypes.Type(value = ItemRemovedEvent::class, name = "ItemRemoved"),
    JsonSubTypes.Type(value = ItemQuantityUpdatedEvent::class, name = "ItemQuantityUpdated"),
    JsonSubTypes.Type(value = CartClearedEvent::class, name = "CartCleared"),
    JsonSubTypes.Type(value = CartCheckedOutEvent::class, name = "CartCheckedOut"),
)
interface Event {
    val aggregateId: String
    val timestamp: Instant

    fun getEventType(): String = this::class.simpleName ?: "UnknownEvent"
}
