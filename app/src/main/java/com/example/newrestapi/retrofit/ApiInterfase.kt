package com.example.newrestapi.retrofit

import com.example.newrestapi.model.Result
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterfase {
    @GET("reverse?format=geocodejson")
    fun getClasses(@Query("lat")lat:String,@Query("lon")long:String): Call<Result>
}