package com.nytimesapp.repository

import com.nytimesapp.model.NYTimesResponse
import com.nytimesapp.network.ApiService
import javax.inject.Inject

class NYTimesRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getArticlesNYTimes(): NYTimesResponse {
        return apiService.getArticlesNYTimes()
    }
}