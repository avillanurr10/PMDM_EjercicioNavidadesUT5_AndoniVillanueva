package com.example.ejercicionavidadandonivillanueva.ui.data.network

import com.example.ejercicionavidadandonivillanueva.ui.data.model.ApiResponse
import retrofit2.http.GET

interface ApiService {

    @GET("character")
    suspend fun getCharacters(): ApiResponse
}
