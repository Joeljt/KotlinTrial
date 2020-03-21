package net.aihelp.test

import android.content.Context
import android.util.Log

/**
 * Created by JoeLjt on 2020/3/21.
 * Email: lijiateng1219@gmail.com
 * Description:
 *
 */
object TestBintaryLib{

    private val TAG = "TestBintaryLib"

    private lateinit var context: Context;

    fun init(context: Context, appId: String) {
        this.context = context.applicationContext;
        Log.e(TAG, "appId is $appId")
    }

}