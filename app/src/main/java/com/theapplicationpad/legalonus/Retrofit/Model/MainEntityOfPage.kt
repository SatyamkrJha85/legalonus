package com.example.testjson.model

import com.google.gson.annotations.SerializedName

data class MainEntityOfPage(
    @SerializedName("@id")
    val id: String
)
