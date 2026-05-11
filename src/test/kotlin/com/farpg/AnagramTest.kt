package com.farpg

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class AnagramTest {

    @Test
    fun `returns true for two words that are anagrams`() {
        assertTrue("abcde".isAnagramOf("edcba"))
    }

    @Test
    fun `returns false for two unrelated words`() {
        assertFalse("hello".isAnagramOf("world"))
    }

    @Test
    fun `is case-insensitive`() {
        assertTrue("ABCDE".isAnagramOf("edcba"))
    }

    @Test
    fun `returns false when lengths differ`() {
        assertFalse("abcde".isAnagramOf("abcd"))
    }

    @Test
    fun `returns false when letter counts differ`() {
        assertFalse("aab".isAnagramOf("abb"))
    }

    @Test
    fun `a word is an anagram of itself`() {
        assertTrue("abcde".isAnagramOf("abcde"))
    }

    @Test
    fun `two empty strings are anagrams`() {
        assertTrue("".isAnagramOf(""))
    }

    @Test
    fun `empty string is not an anagram of a non-empty string`() {
        assertFalse("".isAnagramOf("a"))
    }

    @Test
    fun `findAnagramGroups returns empty list when input is empty`() {
        assertTrue(findAnagramGroups(emptyList()).isEmpty())
    }

    @Test
    fun `findAnagramGroups returns empty list when no anagrams exist`() {
        assertTrue(findAnagramGroups(listOf("abc", "def", "ghi")).isEmpty())
    }

    @Test
    fun `findAnagramGroups groups a pair of anagrams together`() {
        val result = findAnagramGroups(listOf("abcde", "edcba", "aaaaaa"))
        assertEquals(1, result.size)
        assertEquals(setOf("abcde", "edcba"), result[0].toSet())
    }

    @Test
    fun `findAnagramGroups groups three anagrams into one group`() {
        val result = findAnagramGroups(listOf("abc", "bca", "cab"))
        assertEquals(1, result.size)
        assertEquals(setOf("abc", "bca", "cab"), result[0].toSet())
    }

    @Test
    fun `findAnagramGroups returns multiple groups`() {
        val result = findAnagramGroups(listOf("abc", "cba", "xyz", "yzx", "abcde"))
        assertEquals(2, result.size)
        val asSets = result.map { it.toSet() }.toSet()
        assertEquals(setOf(setOf("abc", "cba"), setOf("xyz", "yzx")), asSets)
    }

    @Test
    fun `findAnagramGroups excludes singletons`() {
        val result = findAnagramGroups(listOf("abc", "cba", "abcde"))
        assertEquals(1, result.size)
        assertFalse(result.any { "abcde" in it })
    }

    @Test
    fun `findAnagramGroups is case-insensitive`() {
        val result = findAnagramGroups(listOf("ABCDE", "edcba"))
        assertEquals(1, result.size)
        assertEquals(setOf("ABCDE", "edcba"), result[0].toSet())
    }
}
