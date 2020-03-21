package net.aihelp.weatherapp.data

/**
 * Created by JoeLjt on 2020/3/14.
 * Email: lijiateng1219@gmail.com
 * Description:
 *
 */
data class City(val id: Long, val name: String, val coord: Coordinates,
                val country: String, val population: Int)