package com.mehedi.androidunittest


import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Test
import java.io.FileNotFoundException

class QuoteRepoTest {

    private lateinit var repo: QuoteRepo
    private lateinit var context: Context


    @Before
    fun setUp() {
        repo = QuoteRepo()
        context = ApplicationProvider.getApplicationContext()
    }

    @Test(expected = FileNotFoundException::class)
    fun quotesFromAssets_input_invalid_file_name_Expected_FilnotfoundException() {
        repo.quotesFromAssets(context, "quotes.jsons")
    }

    @Test(expected = JsonSyntaxException::class)
    fun quotesFromAssets_input_malformed_json_Expected_JsonSyntaxException() {
        repo.quotesFromAssets(context, "quotes_mal.json")
    }

    @Test
    fun quotesFromAssets_input_size102_json_match() {
        repo.quotesFromAssets(context, "quotes.json")

        assertEquals(102, repo.quoteList.size)


    }


}