package com.plcoding.weatherapp.presentation

import com.plcoding.weatherapp.domain.util.Resource
import com.plcoding.weatherapp.domain.weather.WeatherInfo

data class WeatherState(
    val WeatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
