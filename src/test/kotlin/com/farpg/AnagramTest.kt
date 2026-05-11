package com.farpg

import kotlin.test.Test
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
}
