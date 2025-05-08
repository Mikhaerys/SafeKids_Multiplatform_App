package edu.unicauca.aplimovil.safekids

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    SafeKidsApplication.initialize(PlatformContext()) // Initialize SafeKidsApplication
    Window(
        onCloseRequest = ::exitApplication,
        title = "SafeKids",
    ) {
        App()
    }
}