package com.candybytes.taco.vo

import com.google.gson.annotations.SerializedName

data class Nutrient(
    /**
     */
    @SerializedName("unit")
    val unit: String = "",

    /**
     *
     */
    @SerializedName("qty")
    val qty: String = ""
)
