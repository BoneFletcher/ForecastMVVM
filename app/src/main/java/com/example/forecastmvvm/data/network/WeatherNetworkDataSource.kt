package com.example.forecastmvvm.data.network

import androidx.lifecycle.LiveData
import com.example.forecastmvvm.data.network.response.CurrentWeatherResponse

/**
 * Created by FrostEagle on 08.10.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */
interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
            location:String,
            languageCode:String
    )
}