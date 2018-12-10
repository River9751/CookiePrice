package com.example.river.cookieprice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val order = arrayOf(1, 3, 7, 12)
        val cookieFactory = CookieFactory(order)
        val result = cookieFactory.getResult()

        textView.text = result.toString()
        println(result)
    }
}