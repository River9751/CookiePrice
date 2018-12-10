package com.example.river.cookieprice.Products

import com.example.river.cookieprice.Product

class SmallPackage(val amount: Int) : Product {

    val packagePrice = 10

    override fun getPrice(): Int {
        return amount * 10 + packagePrice
    }
}