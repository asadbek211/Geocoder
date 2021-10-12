package com.example.newrestapi.model

data class Geocoding(
    val accuracy: Int,
    val admin: Admin,
    val city: String,
    val country: String,
    val county: String,
    val label: String,
    val osm_id: Int,
    val osm_type: String,
    val place_id: Int,
    val postcode: String,
    val state: String,
    val type: String
)