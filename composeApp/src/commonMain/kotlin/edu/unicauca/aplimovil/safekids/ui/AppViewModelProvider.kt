package edu.unicauca.aplimovil.safekids.ui

import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import edu.unicauca.aplimovil.safekids.SafeKidsApplication
import edu.unicauca.aplimovil.safekids.ui.viewmodel.GuardianMoneyProfileViewModel
import edu.unicauca.aplimovil.safekids.ui.viewmodel.GuardianProfileViewModel
import edu.unicauca.aplimovil.safekids.ui.viewmodel.ItemEntryViewModel
import edu.unicauca.aplimovil.safekids.ui.viewmodel.LoginViewModel
import edu.unicauca.aplimovil.safekids.ui.viewmodel.TeacherProfileViewModel

/**
 * Provides Factory to create instance of ViewModel for the entire Inventory app
 */
object AppViewModelProvider {
    val Factory = viewModelFactory {
        // Initializer for ItemEntryViewModel
        initializer {
            ItemEntryViewModel(SafeKidsApplication.container.itemsRepository)
        }
        initializer {
            LoginViewModel(SafeKidsApplication.container.guardiansRepository,
                SafeKidsApplication.container.teachersRepository)
        }
        initializer {
            TeacherProfileViewModel(SafeKidsApplication.container.guardiansRepository,
                SafeKidsApplication.container.teachersRepository,
                SafeKidsApplication.container.studentCoursesRepository)
        }
        initializer {
            GuardianProfileViewModel(SafeKidsApplication.container.guardiansRepository,
                SafeKidsApplication.container.studentGuardiansRepository)
        }
        initializer {
            GuardianMoneyProfileViewModel(SafeKidsApplication.container.guardiansRepository,
                SafeKidsApplication.container.studentGuardiansRepository,
                SafeKidsApplication.container.moneyRepository)
        }
    }
}
