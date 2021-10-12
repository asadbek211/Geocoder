package com.example.newrestapi.retrofit

import com.example.newrestapi.model.Result
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiInterfase {
    @GET("reverse?")
    fun getClasses(@Path("query")lat:String): Call<Result>
}