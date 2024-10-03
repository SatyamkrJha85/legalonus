package com.example.testjson.model

import com.google.gson.annotations.SerializedName

data class QueryInput(
    @SerializedName("@type")
    val type: String,
    val valueName: String,
    val valueRequired: Boolean
)
