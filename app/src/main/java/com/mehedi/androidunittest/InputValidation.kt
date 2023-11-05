package com.mehedi.androidunittest

class InputValidation {


    fun passwordValidation(input: String): String = when {
        input.isNullOrBlank() -> {
            "Password Required"
        }

        input.length < 6 -> {
            "Password length more than 6 char"
        }

        input.length > 16 -> {
            "Password length less than 17 char"
        }

        else -> {
            "Valid"
        }


    }


}