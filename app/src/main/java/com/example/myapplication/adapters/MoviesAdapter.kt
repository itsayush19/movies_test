package com.example.myapplication.adapters

import androidx.recyclerview.widget.RecyclerView
import com.example.movie_lib.data.Search

class MoviesAdapter(private var questions:List<Search>?) : RecyclerView.Adapter<>() {



    inner class MoviesViewHolder(itemView: MovieItemBinding) : RecyclerView.ViewHolder(itemView) {

    }
}