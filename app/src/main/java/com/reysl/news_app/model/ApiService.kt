package com.reysl.news_app.model

import retrofit2.http.GET

interface ApiService {
    @GET("path_to_cities")
    suspend fun getCities(): List<City>
}