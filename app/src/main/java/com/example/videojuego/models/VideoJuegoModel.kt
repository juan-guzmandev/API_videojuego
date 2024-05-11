package com.example.videojuego.models

import com.google.gson.annotations.SerializedName

data class VideoJuegoModel(
    @SerializedName("counts")
    val total: Int,
    @SerializedName("results")
    val listaVideojuegos: List<VideoJuegoLista>
)

data class VideoJuegoLista(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val nombre: String,
    @SerializedName("background_image")
    val imagen: String
)