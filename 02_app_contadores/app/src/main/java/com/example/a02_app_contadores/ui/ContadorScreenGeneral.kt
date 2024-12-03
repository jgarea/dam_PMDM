package com.example.a02_app_contadores.ui

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

@Composable
fun ContadorScreenGeneral(modifier: Modifier = Modifier) {
    var contadorGeneral by remember { mutableStateOf(0) }

    LazyColumn {
        item {
            Row {
                Text(text = "Contador general: ")
                Text(text = contadorGeneral.toString())
            }
        }

    }

}