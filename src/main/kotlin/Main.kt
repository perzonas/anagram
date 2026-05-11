package com.farpg

fun main() {
    val words = readWordFile()
    println("Antall ord: ${words.size}")
    println("Førsta 10 orden: ${words.take(10)}")
}