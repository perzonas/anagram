package com.farpg

fun main() {
    val words = readWordFile()
    val groups = findAnagramGroups(words)
    printAnagramGroups(groups)
}