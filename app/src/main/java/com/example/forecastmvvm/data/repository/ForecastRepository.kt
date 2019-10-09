package com.example.forecastmvvm.data.repository

import androidx.lifecycle.LiveData
import com.example.forecastmvvm.data.db.unitlocalized.UnitSpecificCurrentWeatherEntry

/**
 * Created by FrostEagle on 09.10.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */
interface ForecastRepository {
    suspend fun getCurrentWeather():LiveData<out UnitSpecificCurrentWeatherEntry>
}