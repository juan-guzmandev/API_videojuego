package com.example.videojuego.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.videojuego.components.CardJuego
import com.example.videojuego.components.MainTopBar
import com.example.videojuego.util.Consts
import com.example.videojuego.viewModels.VideojuegosViewModel

@Composable
fun InicioView(
    navController: NavController,
    viewModel: VideojuegosViewModel
) {
    Scaffold (
        topBar = {
            MainTopBar(titulo = "API JUEGOS")
        }
    ) {
        ContenidoInicioView(
            navController = navController,
            viewModel = viewModel,
            pad = it
        )
    }
}

@Composable
fun ContenidoInicioView(
    navController: NavController,
    viewModel: VideojuegosViewModel,
    pad: PaddingValues
) {
    val juegos by viewModel.juegos.collectAsState()

    LazyColumn(
        modifier = Modifier
            .padding(pad)
            .background(Color(Consts.COLOR_ROJO))
    ) {
        items(juegos){
            CardJuego(juego = it) { }
            Text(
                text = it.nombre,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White,
                modifier = Modifier
                    .padding(start = 12.dp)
            )
        }
    }
}