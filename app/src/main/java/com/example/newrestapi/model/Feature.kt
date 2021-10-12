package com.example.newrestapi.model

data class Feature(
    val geometry: Geometry,
    val properties: Properties,
    val type: String
)