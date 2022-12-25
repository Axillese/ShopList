package com.example.shoplist.domain

class AddShopItemCase(private val shopListRepository: shopListRepository) {
    fun addShopItem(shopItem: ShopItem) {
        shopListRepository.addShopItem(shopItem)

    }
}