package com.mehedi.androidunittest


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class QuoteItem(
    @SerializedName("author")
    var author: String? = null,
    @SerializedName("quote")
    var quote: String? = null
)