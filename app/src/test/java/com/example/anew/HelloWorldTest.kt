package com.example.anew

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Verifies that the message shown by [HelloWorld] on app launch is exactly
 * `Hello world!`.
 */
class HelloWorldTest {
    @Test
    fun message_isHelloWorld() {
        assertEquals("Hello world!", HELLO_WORLD_MESSAGE)
    }
}
