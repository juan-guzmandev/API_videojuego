package com.example.videojuego

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.videojuego.navigation.NavManager
import com.example.videojuego.ui.theme.VideojuegoTheme
import com.example.videojuego.viewModels.VideojuegosViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: VideojuegosViewModel by viewModels()
        enableEdgeToEdge()
        setContent {
            //NavManager(viewModel = viewModel)
            VideojuegoTheme {
              //  Scaffold(modifier = Modifier.fillMaxSize()) {

               //
               // }
                NavManager(viewModel = viewModel)
            }
        }
    }
}

