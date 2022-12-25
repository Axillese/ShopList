package com.example.shoplist.domain

class DeleteShopItemUseCase(private val shopListRepository: shopListRepository) {
    fun deleteShopItem(shopItem: ShopItem) {
       shopListRepository.deleteShopItem(shopItem)
    }
}