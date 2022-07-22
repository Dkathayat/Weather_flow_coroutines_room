package com.rad.rweather.core.domain.repository

import androidx.lifecycle.LiveData
import com.rad.rweather.core.data.Resource
import com.rad.rweather.core.domain.model.Forecast
import com.rad.rweather.core.domain.model.ListForecast

interface IWeatherRepository {

    fun getForecast(lat: Double, lon: Double): LiveData<Resource<Forecast>>
}