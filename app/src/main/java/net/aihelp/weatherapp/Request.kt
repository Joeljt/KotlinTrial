package net.aihelp.weatherapp

import com.google.gson.Gson
import net.aihelp.weatherapp.data.Forecast
import net.aihelp.weatherapp.data.ForecastResult
import java.net.URL

/**
 * Created by JoeLjt on 2020/3/14.
 * Email: lijiateng1219@gmail.com
 * Description:
 *
 */
class Request(private val zipCode: String) {

    // 伴生对象，此对象被当前类的所有对象共有，类似 Java 的静态
    companion object{
        private val APP_ID = "15646a06818f61f7b8d7823ca833e1ce"
        private val URL = "http://api.openweathermap.org/data/2.5/forecast/daily?mode=json&units=metric&cnt=7"
        private val COMPLETE_URL = "$URL&APPID=$APP_ID&q="
    }

    fun execute() : ForecastResult{
        val jsonResult = URL(COMPLETE_URL + zipCode).readText()
        return Gson().fromJson(jsonResult, ForecastResult::class.java)
    }
}