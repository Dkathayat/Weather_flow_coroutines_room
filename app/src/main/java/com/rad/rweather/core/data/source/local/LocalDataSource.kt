package com.rad.rweather.core.data.source.local

import androidx.lifecycle.LiveData
import com.rad.rweather.core.data.source.local.entity.ForecastEntity
import com.rad.rweather.core.data.source.local.room.ForecastDao

class LocalDataSource private constructor(private val forecastDao: ForecastDao) {

    companion object {
        private var instance: LocalDataSource? = null

        fun getInstance(forecastDao: ForecastDao): LocalDataSource =
            instance ?: synchronized(this) {
                instance ?: LocalDataSource(forecastDao)
            }
    }

    fun getForecast(): LiveData<ForecastEntity> = forecastDao.getForecast()

    fun insertForecast(forecast: ForecastEntity) = forecastDao.insertForecast(forecast)
}