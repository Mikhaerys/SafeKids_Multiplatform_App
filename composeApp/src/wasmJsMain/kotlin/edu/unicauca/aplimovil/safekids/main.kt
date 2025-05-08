package edu.unicauca.aplimovil.safekids

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    SafeKidsApplication.initialize(PlatformContext()) // Initialize SafeKidsApplication
    ComposeViewport(document.body!!) {
        App()
    }
}