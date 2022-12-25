package com.example.shoplist.domain

class GetShopItemUseCase(private val shopListRepository: shopListRepository) {
    fun getShopItem(ShopItemId: Int):ShopItem {
       return shopListRepository.getShopItem(ShopItemId)
    }
}