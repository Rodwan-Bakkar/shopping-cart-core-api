package com.rodwan.coreapi.dtos

import java.math.BigDecimal
import java.time.Instant

data class CartItemsResponse(
    val cartId: String,
    val userId: String,
    val items: List<CartItemDto>,
    val totalAmount: BigDecimal,
    val itemCount: Int,
    val lastModified: Instant,
)
