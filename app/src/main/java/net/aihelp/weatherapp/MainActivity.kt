package net.aihelp.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import net.aihelp.weatherapp.data.Forecast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<TextView>(R.id.text)
        view.text = ""

        toast(view.text)

        val forecast =
            Forecast(Date(), 28.4f, "Nothing more")
        val copiedForecast = forecast.copy(temperature = 32.4f)

        val (d, t, i) = forecast;

        Log.e("TAG","d is $d, t is $t, i is $i")

    }

}
