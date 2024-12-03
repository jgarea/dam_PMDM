package com.example.a02_app_contadores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a02_app_contadores.navigation.AppNavigation
import com.example.a02_app_contadores.ui.ContadorScreenGeneral
import com.example.a02_app_contadores.ui.PrincipalScreen
import com.example.a02_app_contadores.ui.theme._02_app_contadoresTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _02_app_contadoresTheme {
                AppNavigation()
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    _02_app_contadoresTheme {
        AppNavigation()
    }
}