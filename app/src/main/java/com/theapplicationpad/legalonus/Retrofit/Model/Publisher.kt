package com.example.testjson.model

import com.google.gson.annotations.SerializedName

data class Publisher(
    @SerializedName("@id")
    val id: String
)
