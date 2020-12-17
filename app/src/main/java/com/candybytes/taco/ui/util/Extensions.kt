package com.candybytes.taco.ui.util

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken


/**
 * convert a object to a json string
 */
fun Any.toJson(): String = Gson().toJson(this)

/**
 * convert a json to an object
 */
inline fun <reified T> String?.fromJson() =
    if (this == null) null
    else
        Gson().fromJson<T>(this, object : TypeToken<T>() {}.type)
