package com.theapplicationpad.legalonus.Retrofit


import com.theapplicationpad.legalonus.Retrofit.Model.ListModel
import retrofit2.Response
import retrofit2.http.GET

interface LawArticlaApi{
    @GET("wp-json/wp/v2/posts?categories=21")
    suspend fun GetLawArticle():Response<ListModel>
}