package com.example.newrestapi

import android.util.Log
import com.example.newrestapi.model.AddressModel
import com.example.newrestapi.model.Geocoding
import com.example.newrestapi.model.Result
import com.example.newrestapi.retrofit.ApiInterfase
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class NetworkHelper(private val apiClient:Retrofit) {
    fun getClasses(listener: NetworkListener, lat: String, long: String){
        val call = apiClient.create(ApiInterfase::class.java).getClasses("60.229917843587,11.16630979382")
        call.enqueue(  object: Callback<Result> {
            override fun onResponse(
                call: Call<Result>,
                response: Response<Result>?
            ) {
                listener.onSchoolClassesResponse(response)
            }

            override fun onFailure(call: Call<Result>?, t: Throwable?) {
                listener.onSchoolClassesFailure(t?.localizedMessage)
            }
        })
    }
}