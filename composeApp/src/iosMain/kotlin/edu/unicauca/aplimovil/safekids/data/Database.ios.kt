package edu.unicauca.aplimovil.safekids.data

import edu.unicauca.aplimovil.safekids.PlatformContext
import edu.unicauca.aplimovil.safekids.data.InventoryDatabase

actual fun getDatabase(context: PlatformContext): InventoryDatabase {
    throw NotImplementedError("Database implementation not available for iOS. Consider using SQLDelight or other native storage solutions.")
}
