package com.example.forecastmvvm.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.forecastmvvm.data.db.entity.CurrentWeatherDao
import com.example.forecastmvvm.data.db.entity.CurrentWeatherEntry

/**
 * Created by FrostEagle on 05.10.2019.
 * My Email: denisshakhov21@gmail.com
 * Skype: lifeforlight
 */

@Database(
    entities = [CurrentWeatherEntry::class],
    version = 1
)
abstract class ForecastDatabase : RoomDatabase() {
    abstract fun currentWeatherDao(): CurrentWeatherDao

    companion object {
        @Volatile
        private var instance: ForecastDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabse(context).also { instance = it }
        }

        private fun buildDatabse(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                ForecastDatabase::class.java, "forecast.db")
                .build()
    }
}