package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movie_lib.data.Search
import com.example.movie_lib.repo.MoviesRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(private val moviesRepo: MoviesRepo): ViewModel() {

    private val _listLiveData: MutableLiveData<List<Search?>> = MutableLiveData()
    val listLiveData: MutableLiveData<List<Search?>> = _listLiveData


    fun search(name: String){
        viewModelScope.launch {
            val response = try {
                moviesRepo.getMovies(name)
            }catch (e: Exception){
                //log
                null
            }
            if(response?.Search!=null){
                _listLiveData.postValue(response.Search)
            }
        }
    }
}