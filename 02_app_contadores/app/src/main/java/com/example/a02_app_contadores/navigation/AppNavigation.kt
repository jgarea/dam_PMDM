package com.example.a02_app_contadores.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a02_app_contadores.ui.ContadorScreen1
import com.example.a02_app_contadores.ui.ContadorScreen2
import com.example.a02_app_contadores.ui.PrincipalScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = AppScreens.PrincipalScreen.route) {
        composable(AppScreens.PrincipalScreen.route) {
            PrincipalScreen(navController = navController)
        }
        composable(AppScreens.ContadorScreen1.route) {
            ContadorScreen1()
        }
        composable(AppScreens.ContadorScreen2.route) {
            ContadorScreen2()
        }

    }
}