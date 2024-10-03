package com.example.testjson.model

import com.google.gson.annotations.SerializedName

data class Schema(
    @SerializedName("@context")
    val context: String,
    @SerializedName("@graph")
    val graph: List<Graph>
)
