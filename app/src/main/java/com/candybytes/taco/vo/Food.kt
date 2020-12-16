package com.candybytes.taco.vo

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(primaryKeys = ["food"])
data class Food(
    /**
     * Food unique ID.
     */
    @SerializedName("id")
    val id: Int = -1,

    /**
     * Food description
     */
    @SerializedName("description")
    val description: String = "",

    /**
     * Amount
     */
    @SerializedName("base_qty")
    val baseQty: Int = -1,

    /**
     * Unit of amount
     */
    @SerializedName("base_unit")
    val baseUnity: String = "",

    /**
     * Category which the food belong
     */
    @SerializedName("category_id")
    val categoryId: Int = -1,

    /**
     * List of nutrients
     */
    @SerializedName("attributes")
    val nutrients: HashMap<String, Nutrient> = hashMapOf()
)
