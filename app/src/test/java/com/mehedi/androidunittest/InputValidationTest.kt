package com.mehedi.androidunittest

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test


class InputValidationTest {

    lateinit var inputValidation: InputValidation

    @Before
    fun setUp() {
        //Arrange
        inputValidation = InputValidation()
    }


    @Test
    fun passwordValidation_input123_expected_Password_length_more_than_6_char() {


        //Act
        val result = inputValidation.passwordValidation("123")
        //Assert
        assertEquals("Password length more than 6 char", result)
    }

    @Test
    fun passwordValidation_inputBlank_expected_Password_Required() {
        //Arrange
        val inputValidation = InputValidation()
        //Act
        val result = inputValidation.passwordValidation("")
        //Assert
        assertEquals("Password Required", result)
    }

    @Test
    fun passwordValidation_input17Char_expected_Password_length_less_than_17_char() {


        //Act
        val result = inputValidation.passwordValidation("11111111111111111")
        //Assert
        assertEquals("Password length less than 17 char", result)
    }

    @Test
    fun passwordValidation_input10Char_expected_Valid() {


        //Act
        val result = inputValidation.passwordValidation("1234567890")
        //Assert
        assertEquals("Valid", result)
    }

    @After
    fun tearDown() {
        println("Test Completed")

    }


}