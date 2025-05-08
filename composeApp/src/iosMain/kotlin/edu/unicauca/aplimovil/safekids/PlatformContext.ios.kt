package edu.unicauca.aplimovil.safekids

/**
 * Implementación `actual` de [PlatformContext] para iOS.
 *
 * En tu `AppDelegate` o punto de entrada de iOS, puedes inicializar SafeKidsApplication así:
 * ```kotlin
 * fun initKoin() { // O cualquier función de inicialización
 *     val iosContext = PlatformContext()
 *     SafeKidsApplication.initialize(iosContext)
 *     // ...
 * }
 * ```
 */
actual class PlatformContext {
    // Similar a la implementación de Desktop, esta clase puede contener datos
    // o lógica específica de la plataforma iOS si es necesario para los módulos comunes.
    // Por ejemplo, para obtener directorios específicos del sistema de archivos de iOS.
}
