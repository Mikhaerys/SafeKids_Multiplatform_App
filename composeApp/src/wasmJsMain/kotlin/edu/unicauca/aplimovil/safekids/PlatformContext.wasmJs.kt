package edu.unicauca.aplimovil.safekids

/**
 * Implementación `actual` de [PlatformContext] para WasmJs.
 *
 * En tu punto de entrada de WasmJs, puedes inicializar SafeKidsApplication así:
 * ```kotlin
 * fun main() {
 *     val wasmJsContext = PlatformContext()
 *     SafeKidsApplication.initialize(wasmJsContext)
 *     // ... resto de tu aplicación WasmJs ...
 * }
 * ```
 */
actual class PlatformContext {
    // Para WasmJs, el "contexto" es a menudo implícito (el entorno del navegador).
    // Esta clase puede permanecer vacía a menos que necesites pasar alguna configuración
    // específica del entorno WasmJs a tu lógica común.
}
