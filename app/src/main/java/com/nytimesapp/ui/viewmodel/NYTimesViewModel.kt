package com.nytimesapp.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.nytimesapp.model.NYTimesResponse
import com.nytimesapp.model.ResultData
import com.nytimesapp.usecase.NYTimesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NYTimesViewModel @Inject constructor(private var usecase: NYTimesUseCase) : ViewModel() {

    private val _responseNYTimes: MutableLiveData<ResultData<NYTimesResponse>> = MutableLiveData()
    val response: LiveData<ResultData<NYTimesResponse>> = _responseNYTimes

    fun getLatestArticles() = viewModelScope.launch {
        _responseNYTimes.value = usecase.getArticlesNYTimes()
    }

}