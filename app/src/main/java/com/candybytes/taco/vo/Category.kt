package com.candybytes.taco.vo

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(primaryKeys = ["category"])
data class Category(

    /**
     * Category unique ID.
     */
    @SerializedName("id")
    val id: Int = -1,

    /**
     * Category description.
     */
    @SerializedName("category")
    val name: String = ""

)
