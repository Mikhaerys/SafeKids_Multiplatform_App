package edu.unicauca.aplimovil.safekids

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import edu.unicauca.aplimovil.safekids.ui.viewmodel.TeacherProfileViewModel
import edu.unicauca.aplimovil.safekids.ui.AppViewModelProvider
import edu.unicauca.aplimovil.safekids.ui.screens.ActividadScreen
import edu.unicauca.aplimovil.safekids.ui.screens.AcudienteProfileScreen
import edu.unicauca.aplimovil.safekids.ui.screens.AcudientesScreen
import edu.unicauca.aplimovil.safekids.ui.screens.DescriptionScreen
import edu.unicauca.aplimovil.safekids.ui.screens.DineroScreen
import edu.unicauca.aplimovil.safekids.ui.screens.DocenteProfileScreen
import edu.unicauca.aplimovil.safekids.ui.screens.DocenteScreen
import edu.unicauca.aplimovil.safekids.ui.screens.LoginScreen
import edu.unicauca.aplimovil.safekids.ui.viewmodel.GuardianProfileViewModel

@Composable
fun App(modifier: Modifier = Modifier){
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = Screens.LoginScreen.name) {
        composable(route = Screens.LoginScreen.name){
            val teacherProfileViewModel: TeacherProfileViewModel = viewModel(factory = AppViewModelProvider.Factory)
            val guardianProfileViewModel: GuardianProfileViewModel = viewModel(factory = AppViewModelProvider.Factory)
            LoginScreen(
                onTeacherClick = { id ->
                    teacherProfileViewModel.updateUserId(id)
                    navController.navigate(Screens.DocenteScreen.name)
                },
                onGuardianClick = { id ->
                    guardianProfileViewModel.updateUserId(id)
                    navController.navigate(Screens.AcudientesScreen.name)
                },
                onDescriptionClick = { navController.navigate(Screens.DescriptionScreen.name) }
            )
        }
        composable(route = Screens.DocenteScreen.name){
            DocenteScreen(
                onProfileClick = { navController.navigate(Screens.DocenteProfileScreen.name) },
                onHomeClick = { navController.navigate(Screens.DocenteScreen.name) },
                onActividadClick = { navController.navigate(Screens.ActividadDocenteScreen.name) }
            )
        }
        composable(route = Screens.AcudientesScreen.name){
            AcudientesScreen(
                onProfileClick = { navController.navigate(Screens.AcudienteProfileScreen.name) },
                onHomeClick = { navController.navigate(Screens.AcudientesScreen.name) },
                onActividadClick = { navController.navigate(Screens.ActividadAcudienteScreen.name) },
                onDineroClick = { navController.navigate(Screens.DineroScreen.name) }
            )
        }
        composable(route = Screens.AcudienteProfileScreen.name){
            AcudienteProfileScreen(
                onHomeClick = { navController.navigate(Screens.AcudientesScreen.name) },
                onProfileClick = { navController.navigate(Screens.AcudienteProfileScreen.name) }
            )
        }
        composable(route = Screens.DocenteProfileScreen.name){
            DocenteProfileScreen(
                onHomeClick = { navController.navigate(Screens.DocenteScreen.name) },
                onProfileClick = { navController.navigate(Screens.DocenteProfileScreen.name) }
            )
        }
        composable(route = Screens.ActividadDocenteScreen.name){
            ActividadScreen(
                onHomeClick = { navController.navigate(Screens.DocenteScreen.name) },
                onProfileClick = { navController.navigate(Screens.DocenteProfileScreen.name) }
            )
        }
        composable(route = Screens.ActividadAcudienteScreen.name){
            ActividadScreen(
                onHomeClick = { navController.navigate(Screens.AcudientesScreen.name) },
                onProfileClick = { navController.navigate(Screens.AcudienteProfileScreen.name) }
            )
        }
        composable(route = Screens.DineroScreen.name){
            DineroScreen(
                onHomeClick = { navController.navigate(Screens.AcudientesScreen.name) },
                onProfileClick = { navController.navigate(Screens.AcudienteProfileScreen.name) }
            )
        }
        composable(route = Screens.DescriptionScreen.name){
            DescriptionScreen()
        }
    }

}


enum class Screens(){
    LoginScreen,
    DescriptionScreen,
    DocenteScreen,
    AcudientesScreen,
    AcudienteProfileScreen,
    DocenteProfileScreen,
    ActividadDocenteScreen,
    ActividadAcudienteScreen,
    DineroScreen
}