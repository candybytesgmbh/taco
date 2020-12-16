package com.candybytes.taco.api

import androidx.lifecycle.LiveData
import com.candybytes.taco.vo.Category
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * REST API access points for taco service
 * see https://taco-food-api.herokuapp.com/ for more information
 */
interface TacoService {

//    /**
//     * Request a specific category
//     */
//    @GET("api/v1/category/{categoryId}")
//    fun getCategory(@Path("categoryId") categoryId: Int): LiveData<ApiResponse<Category>>

    /**
     * Request a specific category
     */
    @GET("api/v1/category/{categoryId}")
    suspend fun getCategoryAsync(@Path("categoryId") categoryId: Int): Category

//    /**
//     * Request all available categories
//     */
//    @GET("api/v1/category")
//    fun getAllCategories(): LiveData<ApiResponse<List<Category>>>

    /**
     * Request all available categories
     */
    @GET("api/v1/category")
    suspend fun getAllCategoriesAsync(): List<Category>
}
