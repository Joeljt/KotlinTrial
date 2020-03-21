package net.aihelp.weatherapp.data

import java.util.*

/**
 * Created by JoeLjt on 2020/3/14.
 * Email: lijiateng1219@gmail.com
 * Description:
 *
 */
data class Forecast(
    val dt: Long, val temp: Temperature, val pressure: Float,
    val humidity: Int, val weather: List<Weather>,
    val speed: Float, val deg: Int, val clouds: Int,
    val rain: Float
)