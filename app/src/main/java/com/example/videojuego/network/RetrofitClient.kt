package com.example.videojuego.network

import com.example.videojuego.util.Consts
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val retrofit: APIVideojuegos by lazy {
        Retrofit
            .Builder()
            .baseUrl(Consts.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIVideojuegos::class.java)
    }
}