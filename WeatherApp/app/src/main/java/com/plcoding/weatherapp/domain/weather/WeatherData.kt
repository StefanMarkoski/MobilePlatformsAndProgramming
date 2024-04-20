package com.plcoding.weatherapp.domain.weather

import java.time.LocalDateTime
import java.util.function.DoubleToLongFunction

data class WeatherData(
    val time: LocalDateTime,
    val temperatureCelsius: Double,
    val pressure: Double,
    val windSpeed: Double,
    val humidity: Double,
    val weatherType: WeatherType
)
