package edu.unicauca.aplimovil.safekids

import edu.unicauca.aplimovil.safekids.data.AppContainer
import edu.unicauca.aplimovil.safekids.data.AppDataContainer

object SafeKidsApplication {

    lateinit var container: AppContainer
        private set

    fun initialize(platformContext: PlatformContext) {
        if (!::container.isInitialized) {
            container = AppDataContainer(platformContext)
        }
    }
}
