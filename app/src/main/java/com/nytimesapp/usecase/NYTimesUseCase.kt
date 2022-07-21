package com.nytimesapp.usecase

import com.nytimesapp.model.NYTimesResponse
import com.nytimesapp.model.ResultData
import com.nytimesapp.repository.NYTimesRepository
import javax.inject.Inject

class NYTimesUseCase @Inject constructor(private val repository: NYTimesRepository) {
    suspend fun getArticlesNYTimes(): ResultData<NYTimesResponse> {
        val data = repository.getArticlesNYTimes()
        return ResultData.Success(data)
    }
}