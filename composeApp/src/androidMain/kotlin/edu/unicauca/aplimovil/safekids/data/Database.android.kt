package edu.unicauca.aplimovil.safekids.data

import androidx.room.Room
import edu.unicauca.aplimovil.safekids.PlatformContext

@Volatile
private var Instance: InventoryDatabase? = null
private val LOCK = Any() // Create a dedicated lock object

actual fun getDatabase(context: PlatformContext): InventoryDatabase {
    return Instance ?: synchronized(LOCK) { // Use the dedicated lock object
        Instance ?: Room.databaseBuilder(
            context.androidContext, // Use the actual Android Context
            InventoryDatabase::class.java,
            "safekids_database"
        )
            .fallbackToDestructiveMigration(dropAllTables = true) // Specify dropAllTables parameter
            .build()
            .also { Instance = it }
    }
}

// Add actual implementations for DAOs if they were also expect/actual, though not indicated by errors.
// For now, assuming DAOs are concrete classes/interfaces in commonMain.
