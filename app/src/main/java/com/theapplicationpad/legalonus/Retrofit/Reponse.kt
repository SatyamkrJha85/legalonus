package com.theapplicationpad.legalonus.Retrofit


import com.example.testjson.model.MyModelList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LawArticlaApi{
//    @GET("/wp-json/wp/v2/posts?categories=21")
//    suspend fun GetLawArticle(@Query("category")category:String):Response<MyModelList>

        @GET("/wp-json/wp/v2/posts?categories=")
        suspend fun GetLawArticle(
            @Query("categories") category: String
        ): Response<MyModelList>


    @GET("/wp-json/wp/v2/posts?page=1")
    suspend fun GetPostArticle():Response<MyModelList>
}
