package com.theapplicationpad.legalonus.Retrofit.Model

data class PotentialAction(
    val @type: String,
    val name: String,
    val query-input: QueryInput,
    val target: List<String>
)