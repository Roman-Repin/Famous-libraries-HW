package com.example.lesson1mvp

data class CountersModel(
    var first: Int,
    var second: Int,
    var third: Int
) {
    fun incrementFirst() = ++first
    fun incrementSecond() = ++second
    fun incrementThird() = ++third
}