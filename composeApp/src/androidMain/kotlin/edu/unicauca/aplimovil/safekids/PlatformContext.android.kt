package edu.unicauca.aplimovil.safekids

import android.content.Context

/**
 * Implementación `actual` de [PlatformContext] para Android.
 *
 * Esta clase envuelve una instancia de `android.content.Context`.
 *
 * En tu clase Application de Android, puedes inicializar SafeKidsApplication así:
 * ```kotlin
 * class YourAndroidApplication : Application() {
 *     override fun onCreate() {
 *         super.onCreate()
 *         val androidPlatformContext = PlatformContext(applicationContext)
 *         SafeKidsApplication.initialize(androidPlatformContext)
 *     }
 * }
 * ```
 */
actual class PlatformContext(val androidContext: Context)
