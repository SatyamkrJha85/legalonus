package com.example.testjson.model

import com.google.gson.annotations.SerializedName

data class Breadcrumb(
    @SerializedName("@id")
    val id: String
)
