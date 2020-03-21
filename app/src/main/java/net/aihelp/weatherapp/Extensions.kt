package net.aihelp.weatherapp

import android.content.Context
import android.widget.Toast

/**
 * Created by JoeLjt on 2020/3/14.
 * Email: lijiateng1219@gmail.com
 * Description:
 *
 */
fun Context.toast(msg: CharSequence, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, msg, duration).show();
}