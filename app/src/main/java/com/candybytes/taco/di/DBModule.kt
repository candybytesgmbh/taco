package com.candybytes.taco.di

import android.content.Context
import androidx.room.Room
import com.candybytes.taco.db.FoodDao
import com.candybytes.taco.db.FoodDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ActivityComponent::class)
object DBModule {

    /**
     * Access food in db
     */
    @Provides
    fun provideFoodDao(foodDb: FoodDb): FoodDao {
        return foodDb.foodDao()
    }

    /**
     * DB init
     */
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ): FoodDb {
        return Room.databaseBuilder(
            context,
            FoodDb::class.java,
            "food"
        )
            .createFromAsset("food.db")
            .build()
    }
}
