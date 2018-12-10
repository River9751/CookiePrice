package com.example.river.cookieprice.Products

import com.example.river.cookieprice.Product

class LargePackage(val amount: Int) : Product {

    val packagePrice = 30

    override fun getPrice(): Int {
        return amount * 10 + packagePrice
    }

}