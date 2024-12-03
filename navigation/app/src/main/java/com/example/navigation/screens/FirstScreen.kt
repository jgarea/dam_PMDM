package com.example.navigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.navigation.navigation.AppScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(colors = TopAppBarDefaults.topAppBarColors(),
            title =  { Text("Primera pantalla") }   )
        }
    ) {
        BodyContent(
            modifier = Modifier.padding(it),
            navController
        )

    }
}
@Composable
fun BodyContent(modifier: Modifier,navController: NavController){
    //Añadimos el contenido de la pantalla
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text("Navegando")
        Button(
            onClick = {
                //navegar
                navController.navigate(AppScreens.SecondScreen.route + "/Esto es un parametro")
            }
        ) {
            Text("Navegar")
        }

    }
}