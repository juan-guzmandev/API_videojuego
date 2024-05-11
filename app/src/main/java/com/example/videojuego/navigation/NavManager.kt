package com.example.videojuego.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.videojuego.viewModels.VideojuegosViewModel
import com.example.videojuego.views.InicioView

@Composable
fun NavManager(viewModel: VideojuegosViewModel) {
    
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "inicio"
    ){
        composable("inicio"){
            InicioView(navController, viewModel)
        }
    }
}