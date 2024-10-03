package com.theapplicationpad.legalonus.Retrofit

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.testjson.model.MyModelList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay

import kotlinx.coroutines.launch

class FetchLIstViewModel : ViewModel() {

    private val _resultList = MutableLiveData<PostFetchResponse<MyModelList>>()
    val result: LiveData<PostFetchResponse<MyModelList>> = _resultList

//    init {
//        postList() // Trigger network call
//    }

    private val apiResponse = PostsResponse.postapi

    fun postList(categoryid:String) {

        _resultList.value = PostFetchResponse.Loading

        viewModelScope.launch(Dispatchers.IO) {
            delay(1000)
            try {
                val response = apiResponse.GetLawArticle(categoryid)
                if (response.isSuccessful) {
                    Log.d("=======API Response", response.body().toString() ?: "No response")
                    response.body()?.let {
                        _resultList.postValue(PostFetchResponse.Success(it))
                    } ?: run {
                        _resultList.postValue(PostFetchResponse.Error("Response body is null"))
                    }
                } else {
                    _resultList.postValue(PostFetchResponse.Error("Failed with status code: ${response.code()}"))
                }
            } catch (e: Exception) {
                _resultList.postValue(PostFetchResponse.Error("Exception: ${e.message}"))
            }
        }
    }
}





sealed class PostFetchResponse<out T>{
    data class Success<out T>(val data:T):PostFetchResponse<T>()
    data class Error(val error:String):PostFetchResponse<Nothing>()
    object Loading:PostFetchResponse<Nothing>()

}
