package com.candybytes.taco.di

import android.content.Context
import com.candybytes.taco.Application
import com.candybytes.taco.R
import com.candybytes.taco.api.TacoService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ActivityComponent::class)
object ServiceModule {

    /**
     * Provides [TacoService] REST API
     */
    @Provides
    fun provideTacoService(
        @ApplicationContext context: Context
    ): TacoService {
        return Retrofit.Builder()
            .baseUrl(context.getString(R.string.taco_service_host))
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TacoService::class.java)
    }
}
