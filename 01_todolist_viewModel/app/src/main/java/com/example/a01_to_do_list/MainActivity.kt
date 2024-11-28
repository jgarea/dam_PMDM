package com.example.a01_to_do_list

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.a01_to_do_list.ui.theme._01_todolistTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _01_todolistTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Contenedor()
                    }
                }
            }
        }
    }
}



@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun Contenedor(modifier: Modifier = Modifier,todoViewModel: TodoViewModel = viewModel() ) {
    val state by todoViewModel.uiState.collectAsState()

    //var text by remember { mutableStateOf("") }
    //val names = remember { mutableStateListOf(Nombre("Pepe"), Nombre("Luis")) }

    Column(modifier = modifier.fillMaxSize().padding(16.dp)) {
        // Campo de texto
        TextField(
            value = state.name,
            onValueChange = { todoViewModel.onNameChange(it) },
            label = { Text("Introduce el texto") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
        )

        // Botón para agregar nombres
        Button(
            onClick = {
                if (todoViewModel.uiState.value.name.isNotEmpty()) {
                    todoViewModel.onAddName()
                }
            },
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Text("Agregar Nombre")
        }

        // Espacio
        Spacer(modifier = Modifier.height(16.dp))

        // Mostrar nombres agregados
        RowCard(names = todoViewModel.getNames(),todoViewModel)
    }
}

@Composable
fun RowCard(names: List<Nombre>,todoViewModel: TodoViewModel) {
    LazyColumn {
        items(names) { name ->
            Card(name = name,todoViewModel = todoViewModel)
        }
    }
}

@Composable
fun Card(name: Nombre, modifier: Modifier = Modifier,todoViewModel: TodoViewModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
    ) {
        Text(
            text = "Hola ${name.name}",
            fontSize = 25.sp,
            modifier = modifier.padding(8.dp)
        )
        //var isChecked by remember { mutableStateOf(name.isDone) }
        Checkbox(
            checked = name.isDone,
            onCheckedChange = {
                //todoViewModel.onDeleteName(name)
                todoViewModel.onPulsado()
            }
        )
        Button(
            onClick = { todoViewModel.onDeleteName(name) }
        ) { Text("Borrar") }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewContenedor() {
    _01_todolistTheme {
        Contenedor()
    }
}

