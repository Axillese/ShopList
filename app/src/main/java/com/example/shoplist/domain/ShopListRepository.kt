package com.example.shoplist.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(getShopItem: Int): ShopItem

    fun getShopList(): List<ShopItem>


}