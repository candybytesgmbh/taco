package com.candybytes.taco.api

import com.candybytes.taco.vo.Category
import com.candybytes.taco.vo.Food
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * REST API access points for taco service
 * see https://taco-food-api.herokuapp.com/ for more information
 */
interface TacoService {

    /**
     * Request a specific category
     */
    @GET("api/v1/category/{categoryId}")
    suspend fun getCategoryAsync(@Path("categoryId") categoryId: Int): Category

    /**
     * Request all available categories
     */
    @GET("api/v1/category")
    suspend fun getAllCategoriesAsync(): List<Category>

    /**
     * Request all available categories
     */
    @GET("api/v1/food")
    suspend fun getAllFoodAsync(): List<Food>
}
