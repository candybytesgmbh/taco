package com.candybytes.taco.vo

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(primaryKeys = ["nutrient"])
data class Nutrient(
    /**
     */
    @SerializedName("unit")
    val unit: String = "",

    /**
     */
    @SerializedName("qty")
    val qty: Double = -1.0
)
