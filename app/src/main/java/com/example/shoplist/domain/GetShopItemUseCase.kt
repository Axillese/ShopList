package com.example.shoplist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(ShopItemId: Int):ShopItem {
       return shopListRepository.getShopItem(ShopItemId)
    }
}