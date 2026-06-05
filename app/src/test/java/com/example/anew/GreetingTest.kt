package com.example.anew

import org.junit.Assert.assertEquals
import org.junit.Test

class GreetingTest {
    @Test
    fun greeting_displays_hello_world() {
        val name = "world"
        val actual = "Hello $name!"
        assertEquals("Hello world!", actual)
    }
}
