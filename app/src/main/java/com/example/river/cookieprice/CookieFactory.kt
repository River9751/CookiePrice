package com.example.river.cookieprice

import com.example.river.cookieprice.Products.BigPackage
import com.example.river.cookieprice.Products.LargePackage
import com.example.river.cookieprice.Products.SmallPackage

class CookieFactory {

    var mOrder = arrayOf<Int>()
    var mProducts = mutableListOf<Product>()

    constructor(order: Array<Int>) {
        this.mOrder = order
    }

    fun getProducts(): MutableList<Product> {

        for (i in this.mOrder) {
            if (i in 1..5) {
                mProducts.add(SmallPackage(i))
                continue
            }
            if (i in 6..10) {
                mProducts.add(BigPackage(i))
                continue
            }
            if (i in 11..15) {
                mProducts.add(LargePackage(i))
                continue
            }
        }

        return this.mProducts
    }

    fun getResult(): MutableList<Int> {
        val products = this.getProducts()
        val output: MutableList<Int>
        output = products.map { x -> x.getPrice() }.toMutableList()
        return output
    }
}