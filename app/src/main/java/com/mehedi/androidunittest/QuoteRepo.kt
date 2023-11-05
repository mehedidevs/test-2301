package com.mehedi.androidunittest

import android.content.Context
import android.util.Log
import com.google.gson.Gson
import java.io.File

class QuoteRepo {

     var quoteList = emptyArray<QuoteItem>()
    private var currentIndex = 0

    /**
     * this function is using get json from assets
     * @param[context] context of view
     * @param[fileName] fileName that contains quotes json
     * @return[Unit]
     */
    fun quotesFromAssets(context: Context, fileName: String) {
        val inputStream = context.assets.open(fileName)
        val size = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val rawData = String(buffer, Charsets.UTF_8)
        Log.d("TAG", "quotesFromAssets: $rawData")
        val gson = Gson()
        quoteList = gson.fromJson(rawData, Array<QuoteItem>::class.java)
        Log.d("TAG", "size: ${quoteList.size}")
    }


    fun getCurrentQuote(): QuoteItem {

        return quoteList[currentIndex]

    }


    fun getNextQuote(): QuoteItem {

        if (currentIndex == quoteList.size - 1) return quoteList[currentIndex]
        return quoteList[++currentIndex]

    }


    fun getPreviousQuote(): QuoteItem {

        if (currentIndex == 0) return quoteList[currentIndex]
        return quoteList[--currentIndex]

    }


}