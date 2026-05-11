package com.farpg


// Jæmfør strings når de er sortert da slipper jeg sjekke hver bokstav individuelt
fun String.isAnagramOf(otherString: String): Boolean =
    this.lowercase().toCharArray().sorted() == otherString.lowercase().toCharArray().sorted()
