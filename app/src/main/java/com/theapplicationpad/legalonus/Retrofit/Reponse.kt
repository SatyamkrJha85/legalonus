package com.theapplicationpad.legalonus.Retrofit


import com.example.testjson.model.MyModelList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LawArticlaApi{
    @GET("/wp-json/wp/v2/posts?categories=21")
    suspend fun GetLawArticle():Response<MyModelList>
}
