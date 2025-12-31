package com.rodwan.coreapi.dtos

import java.math.BigDecimal
import java.time.Instant

data class CheckoutResponse(
    val orderId: String,
    val cartId: String,
    val totalAmount: BigDecimal,
    val itemCount: Int,
    val status: OrderStatus,
    val timestamp: Instant = Instant.now(),
)
