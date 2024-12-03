package com.example.navigation.navigation

/**
 * Será una clase sellada para reperentar las pantallas de la aplicacion
 */
sealed class AppScreens(val route: String) {
    object FirstScreen : AppScreens("first_screen")
    object SecondScreen : AppScreens("second_screen")
}
