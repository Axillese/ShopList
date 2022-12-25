package com.example.shoplist.domain

class EditShopItemUseCase(private val shopListRepository: shopListRepository) {
    fun editShopItem(shopItem: ShopItem) {
       shopListRepository.editShopItem(shopItem)
    }
}