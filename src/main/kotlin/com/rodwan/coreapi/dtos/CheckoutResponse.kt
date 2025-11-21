package com.rodwan.coreapi.dtos

import java.time.Instant

// Checkout Response
data class CheckoutResponse(
    val orderId: String,
    val cartId: String,
    val totalAmount: Double,
    val itemCount: Int,
    val status: OrderStatus,
    val timestamp: Instant = Instant.now(),
)

enum class OrderStatus {
    PENDING,
    CONFIRMED,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELLED,
}
