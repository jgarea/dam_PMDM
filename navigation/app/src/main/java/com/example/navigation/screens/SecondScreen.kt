package com.example.navigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SecondScreen(navController:NavController,text: String?) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Segunda pantalla") },
                navigationIcon = {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Vovler",
                        modifier = Modifier.clickable {
                            // Vovler a la pantalla anterior
                            navController.popBackStack()
                        }
                    )
                }
            )
        }
    ) {
        SecondBodyContent(
            modifier = Modifier.padding(it),
            navController,
            text
        )
    }
}

@Composable
fun SecondBodyContent(modifier: Modifier,navController: NavController, text: String?) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text("He navegado a la segunda pantalla")
        text?.let {
            Text("Texto: $it")
        }
        Button(onClick = {
            navController.popBackStack() //Vuelve a la anterior
        }) {
            Text("Volver")
        }
    }
}
