package edu.unicauca.aplimovil.safekids.data

import edu.unicauca.aplimovil.safekids.PlatformContext
import edu.unicauca.aplimovil.safekids.data.InventoryDatabase

actual fun getDatabase(context: PlatformContext): InventoryDatabase {
    throw NotImplementedError("Database implementation not available for WasmJs. Consider IndexedDB, localStorage, or SQLDelight for web.")
}
