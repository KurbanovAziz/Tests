package com.example.test

class Match {
    fun add(a: String, b: String): String {
        val result: String
        if (a.contains(".") || b.contains(".")) {
            result = (a.toDouble() + a.toDouble()).toString()
        } else if (!isInteger(a) || !isInteger(b)) {
            result = "Нельзя писать символы"
        }
        else {
            result = (a.toInt() + b.toInt()).toString()
        }
        return result
    }

    fun divide(a: String, b: String): String {
        val result: String
        if (b == "0") {
            result = "Делить на ноль нельзя"
        } else {
            result = (a.toInt() / a.toInt()).toString()
        }
        return result
    }

    fun isInteger(str : String?) = str?.toIntOrNull()?.let { true } ?: false
}