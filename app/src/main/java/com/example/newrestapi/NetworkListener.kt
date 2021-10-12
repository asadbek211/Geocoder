package com.example.newrestapi

import com.example.newrestapi.model.Result
import retrofit2.Response

interface NetworkListener {
    fun onSchoolClassesResponse(models:Response<Result>?)
    fun onSchoolClassesFailure(message: String?)
}