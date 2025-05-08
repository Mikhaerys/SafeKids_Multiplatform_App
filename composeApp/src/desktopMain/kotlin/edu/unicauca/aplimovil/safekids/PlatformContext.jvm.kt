package edu.unicauca.aplimovil.safekids

/**
 * Implementación `actual` de [PlatformContext] para Desktop (JVM).
 *
 * En tu función `main` de Desktop, puedes inicializar SafeKidsApplication así:
 * ```kotlin
 * fun main() {
 *     val desktopContext = PlatformContext()
 *     SafeKidsApplication.initialize(desktopContext)
 *     // ... resto de tu aplicación Desktop ...
 * }
 * ```
 */
actual class PlatformContext {
    // Esta clase puede estar vacía si no se necesita un estado específico de la plataforma Desktop
    // para la inicialización de servicios comunes.
    // Si, por ejemplo, necesitas determinar una ruta de archivo para la base de datos
    // de una manera específica en Desktop, podrías añadir propiedades aquí.
}
