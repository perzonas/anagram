package com.farpg


// Jæmfør char arrays når de er sortert da slipper jeg sjekke hver bokstav individuelt i den andre stringen og slipper komplexitet av flere bokstaver i ordet.
fun String.isAnagramOf(otherString: String): Boolean =
    this.lowercase().toCharArray().sorted() == otherString.lowercase().toCharArray().sorted()
