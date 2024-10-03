package com.example.testjson.model

import com.google.gson.annotations.SerializedName

data class AuthorX(
    @SerializedName("@id")
    val id: String,
    val name: String
)
