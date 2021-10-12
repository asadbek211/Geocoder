package com.example.newrestapi.model

data class Result(
    val features: List<Feature>,
    val geocoding: GeocodingX,
    val type: String
)