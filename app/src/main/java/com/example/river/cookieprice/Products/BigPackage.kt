package com.example.river.cookieprice.Products

import com.example.river.cookieprice.Product

class BigPackage(val amount: Int) : Product {

    val packagePrice = 20

    override fun getPrice(): Int {
        return amount * 10 + packagePrice
    }
}