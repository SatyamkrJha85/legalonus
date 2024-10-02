package com.theapplicationpad.legalonus.Retrofit

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.theapplicationpad.legalonus.Retrofit.Model.ListModel

import kotlinx.coroutines.launch

class FetchLIstViewModel : ViewModel() {

    private val _resultList = MutableLiveData<PostFetchResponse<ListModel>>()
    val result: LiveData<PostFetchResponse<ListModel>> = _resultList

    init {
        postList() // Trigger network call
    }

    private val apiResponse = PostsResponse.postapi

    fun postList() {
        _resultList.value = PostFetchResponse.Loading

        viewModelScope.launch {
            try {
                val response = apiResponse.GetLawArticle()
                if (response.isSuccessful) {
                    response.body()?.let {
                        _resultList.value = PostFetchResponse.Success(it)
                    } ?: run {
                        _resultList.value = PostFetchResponse.Error("Response body is null")
                    }
                } else {
                    _resultList.value = PostFetchResponse.Error("Failed with status code: ${response.code()}")
                }
            } catch (e: Exception) {
                _resultList.value = PostFetchResponse.Error("Exception: ${e.message}")
            }
        }
    }
}





sealed class PostFetchResponse<out T>{
    data class Success<out T>(val data:T):PostFetchResponse<T>()
    data class Error(val error:String):PostFetchResponse<Nothing>()
    object Loading:PostFetchResponse<Nothing>()

}
