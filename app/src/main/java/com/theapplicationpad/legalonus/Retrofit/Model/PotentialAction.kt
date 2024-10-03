package com.example.testjson.model

import com.google.gson.annotations.SerializedName

data class PotentialAction(
    @SerializedName("@type")
    val type: String,
    val name: String,
    @SerializedName("@query-input")
    val queryInput: QueryInput/*,
    val target: List<String>*/
)
