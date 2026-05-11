package com.farpg

private object WordListLoader

fun readWordFile(resourceName: String = "anagramlist.txt"): List<String> {
    val stream = WordListLoader::class.java.classLoader.getResourceAsStream(resourceName)
        ?: error("Fant ikke filen $resourceName")
    return stream.bufferedReader().useLines { lines ->
        lines.map(String::trim)
            .filter(String::isNotEmpty)
            .toList()
    }
}
