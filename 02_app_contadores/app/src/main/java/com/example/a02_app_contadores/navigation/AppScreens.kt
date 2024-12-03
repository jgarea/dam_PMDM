/**
 * Será una clase sellada para reperentar las pantallas de la aplicacion
 */
sealed class AppScreens(val route: String) {
    object ContadorScreen1 : AppScreens("first_screen")
    object ContadorScreen2 : AppScreens("second_screen")
    object PrincipalScreen : AppScreens("principal_screen")
}
