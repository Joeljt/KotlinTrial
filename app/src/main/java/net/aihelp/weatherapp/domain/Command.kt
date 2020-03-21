package net.aihelp.weatherapp.domain

/**
 * Created by JoeLjt on 2020/3/14.
 * Email: lijiateng1219@gmail.com
 * Description:
 *
 */
interface Command<T> {
    fun execute() : T
}