package com.example.forecastmvvm.data.db.unitlocalized

import androidx.room.ColumnInfo

/**
 * Created by FrostEagle on 05.10.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */
class MetricCurrentWeatherEntry(
    @ColumnInfo(name = "temperature")
    override val temperature: Double,
    @ColumnInfo(name = "windSpeed")
    override val windSpeed: Double,
    @ColumnInfo(name = "windDir")
    override val windDirection: String,
    @ColumnInfo(name = "precip")
    override val precipitationVolume: Double,
    @ColumnInfo(name = "feelslike")
    override val feelsLikeTemperature: Double,
    @ColumnInfo(name = "visibility")
    override val visibilityDistance: String
):UnitSpecificCurrentWeatherEntry {
}