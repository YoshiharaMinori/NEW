package com.example.anew

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * `Hello world!` 表示文字列が要件どおり完全一致することを確認する単体テスト。
 * HelloWorld コンポーザブルはこの [HELLO_WORLD_MESSAGE] を表示する。
 */
class HelloWorldMessageTest {
    @Test
    fun helloWorldMessage_isExactlyHelloWorld() {
        assertEquals("Hello world!", HELLO_WORLD_MESSAGE)
    }
}
