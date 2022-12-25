package com.example.shoplist.domain

class GetShopListUseCase(private val shopListRepository: shopListRepository) {
    fun getShopList():List<ShopItem> {
       return shopListRepository.getShopList()
    }
}