package com.mehedi.androidunittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  quoteRepo= QuoteRepo()

        quoteRepo.quotesFromAssets(applicationContext, "quotes.json")

    }
}