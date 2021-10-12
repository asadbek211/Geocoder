package com.example.newrestapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.newrestapi.Adapter.MyAdapter
import com.example.newrestapi.model.Address
import com.example.newrestapi.model.Geocoding
import com.example.newrestapi.model.Result
import com.example.newrestapi.retrofit.ApiClient
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Response

class MainActivity : AppCompatActivity(),NetworkListener {
    private lateinit var networkHelper: NetworkHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        networkHelper = NetworkHelper(ApiClient.getClient())

       next.setOnClickListener {
           setData(late.text.toString(),longe.text.toString())
       }
    }

    private fun setData(lat: String, long: String) {
       networkHelper.getClasses(this,lat,long)
    }

    override fun onSchoolClassesResponse(models: Response<Result>?) {
        if (models.toString().isEmpty()){
            Toast.makeText(this, "pustoy", Toast.LENGTH_SHORT).show()
        }
         models?.body()?.features?.forEach {
             state.text  = it.properties.geocoding.country
             country.text  = it.properties.geocoding.state
             state2.text  = it.properties.geocoding.county
             state3.text  = it.properties.geocoding.city
         }
//      adapter.models = models!!
    }

    override fun onSchoolClassesFailure(message: String?) {
        Toast.makeText(this, message.toString(), Toast.LENGTH_SHORT).show()
    }
}