package com.example.testjson.model

import com.google.gson.annotations.SerializedName

data class IsPartOf(
    @SerializedName("@id")
    val id: String
)
