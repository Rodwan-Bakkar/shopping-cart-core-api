package com.rodwan.coreapi.dtos

import java.math.BigDecimal

data class CartItemDto(
    val productId: String,
    val productName: String,
    val price: BigDecimal,
    val quantity: Int,
    val subtotal: BigDecimal,
) {
    companion object {
        fun from(
            productId: String,
            productName: String,
            price: BigDecimal,
            quantity: Int,
        ): CartItemDto =
            CartItemDto(
                productId = productId,
                productName = productName,
                price = price,
                quantity = quantity,
                subtotal = price * quantity.toBigDecimal(),
            )
    }
}
