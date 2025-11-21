package com.rodwan.coreapi.dtos

data class CartItemDto(
    val productId: String,
    val productName: String,
    val price: Double,
    val quantity: Int,
    val subtotal: Double,
) {
    companion object {
        fun from(
            productId: String,
            productName: String,
            price: Double,
            quantity: Int,
        ): CartItemDto =
            CartItemDto(
                productId = productId,
                productName = productName,
                price = price,
                quantity = quantity,
                subtotal = price * quantity,
            )
    }
}
