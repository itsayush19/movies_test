package com.example.movie_lib.repo

import com.example.movie_lib.MovieApi
import javax.inject.Inject

class MoviesRepo @Inject constructor(
    private val moviesApi: MovieApi
) {
    suspend fun getMovies(s: String) = moviesApi.getMovies(s)

    suspend fun getMovieDetail(id: String) = moviesApi.getDetails(id)
}