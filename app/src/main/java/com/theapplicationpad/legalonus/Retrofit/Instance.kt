package com.theapplicationpad.legalonus.Retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PostsResponse{
    private val PostUrl ="https://legalonus.com/"

   private fun getreponse():Retrofit{
        return Retrofit.Builder()
            .baseUrl(PostUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val postapi:LawArticlaApi= getreponse().create(LawArticlaApi::class.java)
}