package com.theapplicationpad.legalonus.Retrofit

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class TargetDeserializer : JsonDeserializer<List<String>> {
    override fun deserialize(json: JsonElement, typeOfT: Type, context: JsonDeserializationContext): List<String> {
        return if (json.isJsonArray) {
            // If it's an array, map it to a list of strings
            json.asJsonArray.map { it.asString }
        } else {
            // If it's a single object, wrap it in a list
            listOf(json.asString)
        }
    }
}
