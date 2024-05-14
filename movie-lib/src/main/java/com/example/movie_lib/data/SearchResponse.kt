package com.example.movie_lib.data

data class SearchResponse(
    val Response: String,
    val Search: List<Search?>?,
    val totalResults: String
)