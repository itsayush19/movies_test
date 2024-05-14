package com.example.movie_lib

import com.example.movie_lib.data.MovieDetailResponse
import com.example.movie_lib.data.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET()
    suspend fun getMovies(@Query("s") name: String): SearchResponse?

    @GET()
    suspend fun getDetails(@Query("i") id: String): MovieDetailResponse?
}