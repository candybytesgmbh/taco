package com.candybytes.taco.db

import androidx.room.TypeConverter
import com.candybytes.taco.ui.util.fromJson
import com.candybytes.taco.ui.util.toJson
import com.candybytes.taco.vo.Nutrient

class Converters {

    @TypeConverter
    fun fromHM(map: HashMap<String, Nutrient>?) = map?.toJson()

    @TypeConverter
    fun toHM(map: String?) = map.fromJson<HashMap<String, Nutrient>?>()
}
