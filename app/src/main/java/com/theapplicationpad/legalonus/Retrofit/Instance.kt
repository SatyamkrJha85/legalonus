package com.theapplicationpad.legalonus.Retrofit

import com.example.testjson.model.OgImage
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PostsResponse{
    private val PostUrl ="https://legalonus.com/"

   /* val gson = GsonBuilder()
        .registerTypeAdapter(object : TypeToken<List<String>>() {}.type, SingleOrListDeserializer<String>())
        .registerTypeAdapter(object : TypeToken<List<OgImage>>() {}.type, SingleOrListDeserializer<OgImage>())
        // Add other fields as needed
        .create()*/

    val gson = GsonBuilder()
        .registerTypeAdapter(
            object : TypeToken<List<String>>() {}.type, TargetDeserializer()
        )
        .create()

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(PostUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    val postapi: LawArticlaApi by lazy {
        retrofit.create(LawArticlaApi::class.java)
    }
}
