package com.reysl.news_app.model

class CityRepository {
    suspend fun fetchCities(): List<City> {
        return RetrofitInstance.api.getCities()
    }
}