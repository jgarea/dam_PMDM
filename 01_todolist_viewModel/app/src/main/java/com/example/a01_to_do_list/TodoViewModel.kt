package com.example.a01_to_do_list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class TodoViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    fun onPulsado() {
        _uiState.value = _uiState.value.copy(pulsado = !_uiState.value.pulsado)
    }
    fun onNameChange(newName: String) {
        _uiState.value = _uiState.value.copy(name = newName)
    }
    fun onAddName() {
        if (_uiState.value.name.isNotEmpty()) {
            _uiState.value = _uiState.value.copy(
                names = _uiState.value.names + Nombre(_uiState.value.name),
                name = ""
            )
        }
    }
    fun onDeleteName(name: Nombre) {
        _uiState.value = _uiState.value.copy(
            names = _uiState.value.names.filter { it != name } // Crea una nueva lista sin el elemento eliminado
        )
    }
    fun getNames(): List<Nombre> {
        return _uiState.value.names
    }
    init {

    }




}