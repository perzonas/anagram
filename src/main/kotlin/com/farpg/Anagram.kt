package com.farpg


// Jæmfør char arrays når de er sortert da slipper jeg sjekke hver bokstav individuelt i den andre stringen og slipper komplexitet av flere bokstaver i ordet.
fun String.isAnagramOf(otherString: String): Boolean =
    this.lowercase().toCharArray().sorted() == otherString.lowercase().toCharArray().sorted()


// Må ikke sjekke hvis ord er anagram med andre ord i listen, bruker prinsippen at alle ord som er lik sortert.
// Bruker det sorterte ordet som key i en map og får da gruppert de sammen. filtrerer ut alle values som har mindre en 2 entries (ikke noe anagram)
fun findAnagramGroups(words: List<String>): List<List<String>> =
    words.groupBy { it.lowercase().toCharArray().sorted().joinToString("") }
        .values
        .filter { it.size >= 2 }

fun printAnagramGroups(groups: List<List<String>>) {
    groups.forEach { println(it.joinToString(" ")) }
}
