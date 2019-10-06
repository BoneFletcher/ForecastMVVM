package com.example.forecastmvvm.data.db.unitlocalized

/**
 * Created by FrostEagle on 05.10.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */
interface UnitSpecificCurrentWeatherEntry {
    val temperature: Double
    val windSpeed: Double
    val windDirection: String
    val precipitationVolume: Double
    val feelsLikeTemperature: Double
    val visibilityDistance: String
}