package com.example.a01_to_do_list

data class UiState(
    val pulsado: Boolean = true,
    val name: String = "",
    val names: List<Nombre> = emptyList(),
)