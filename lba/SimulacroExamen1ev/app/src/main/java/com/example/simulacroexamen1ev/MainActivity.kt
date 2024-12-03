package com.example.simulacroexamen1ev

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simulacroexamen1ev.navigation.AppNavigation
import com.example.simulacroexamen1ev.ui.theme.SimulacroExamen1evTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimulacroExamen1evTheme {
                AppNavigation()

            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SimulacroPreview() {
    SimulacroExamen1evTheme {
        //ScreenHome()
        //ScreenGame()
        //ScreenGameOver()
        AppNavigation()

    }
}