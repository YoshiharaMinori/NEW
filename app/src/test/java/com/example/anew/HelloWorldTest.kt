package com.example.anew

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [35])
class HelloWorldTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun displaysHelloWorldOnLaunch() {
        composeTestRule.setContent {
            HelloWorld()
        }

        composeTestRule.onNodeWithText("Hello world!").assertIsDisplayed()
    }
}
