package com.farpg

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MainTest {

    @Test
    fun `test setup smoke test`() {
        assertTrue(true, "testar")
    }

    @Test
    fun `basic arithmetic works`() {
        assertEquals(4, 2 + 2)
    }
}
