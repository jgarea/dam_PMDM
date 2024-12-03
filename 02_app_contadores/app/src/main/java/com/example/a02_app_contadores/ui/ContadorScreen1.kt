package com.example.a02_app_contadores.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ContadorScreen1(modifier: Modifier = Modifier) {

    var contador1 by remember { mutableStateOf(0) }
    var contadorField by remember { mutableStateOf(1) }

    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(),
            title = { Text("Contador1") })
    }) {
        LazyColumn(modifier = modifier.padding(it)) {
            item {
                Row {
                    Text(text = "Contador1: ")
                    Text(text = contador1.toString())
                    Button(onClick = {
                        contador1 += contadorField
                        //contadorGeneral++
                    }) {
                        Text(text = "Incrementar")
                    }
                    Button(onClick = { contador1-- }) {
                        Text(text = "Decrementar")
                    }
                }
            }

        }
    }

}