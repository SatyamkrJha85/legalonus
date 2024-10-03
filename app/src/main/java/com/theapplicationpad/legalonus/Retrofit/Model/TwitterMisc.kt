package com.example.testjson.model

import com.google.gson.annotations.SerializedName

data class TwitterMisc(
    @SerializedName("@Est. reading time")
    val EstReadingTime: String,
    @SerializedName("@Written by")
    val WrittenBy: String
)
