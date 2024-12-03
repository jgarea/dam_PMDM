package com.example.a02_app_contadores.ui

import AppScreens
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun PrincipalScreen(modifier: Modifier = Modifier,navController: NavController) {


    LazyColumn {
        item {
            Button(
                onClick = {
                    navController.navigate(AppScreens.PrincipalScreen.route)
                }
            ) {
                Text(text = "Pantalla general")

            }
        }
        item {
            Button(
                onClick = {
                    navController.navigate(AppScreens.ContadorScreen1.route)
                }
            ) {
                Text(text = "Pantalla 1")

            }
        }
        item {
            Button(
                onClick = {
                    navController.navigate(AppScreens.ContadorScreen2.route)
                }
            ) {
                Text(text = "Pantalla 2")

            }
        }


    }

}