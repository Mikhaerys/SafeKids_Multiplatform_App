package edu.unicauca.aplimovil.safekids.data

import edu.unicauca.aplimovil.safekids.PlatformContext
import edu.unicauca.aplimovil.safekids.data.InventoryDatabase

actual fun getDatabase(context: PlatformContext): InventoryDatabase {
    // For a full JVM implementation with Room, you would typically use SQLite with JDBC.
    // This requires adding dependencies like 'org.xerial:sqlite-jdbc' 
    // and configuring Room appropriately for JVM.
    // A specific Room KMP library or setup might be needed.
    throw NotImplementedError("Database implementation not available for Desktop. Consider Room with SQLite JDBC or other JVM database solutions.")
}
