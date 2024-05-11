package com.example.videojuego.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.videojuego.models.VideoJuegoLista
import com.example.videojuego.network.RetrofitClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class VideojuegosViewModel: ViewModel() {

    private val _juegos = MutableStateFlow<List<VideoJuegoLista>>(emptyList())
    val juegos = _juegos.asStateFlow()

    init {
        obtenerJuegos()
    }

    private fun obtenerJuegos(){
        viewModelScope.launch(Dispatchers.IO){
            withContext(Dispatchers.Main){
                val response = RetrofitClient.retrofit.obtenerJuegos()
                _juegos.value = response.body()?.listaVideojuegos ?: emptyList()
            }
        }
    }
}