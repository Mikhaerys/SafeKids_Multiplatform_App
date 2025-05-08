package edu.unicauca.aplimovil.safekids

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController(): ComposeUIViewController {
    SafeKidsApplication.initialize(PlatformContext()) // Initialize SafeKidsApplication
    return ComposeUIViewController { App() }
}