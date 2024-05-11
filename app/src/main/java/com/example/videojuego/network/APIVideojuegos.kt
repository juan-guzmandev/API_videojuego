package com.example.videojuego.network

import com.example.videojuego.models.VideoJuegoModel
import com.example.videojuego.util.Consts
import retrofit2.Response
import retrofit2.http.GET

interface APIVideojuegos {

    @GET("games${Consts.API_KEY}")
    suspend fun obtenerJuegos():  Response<VideoJuegoModel>
}