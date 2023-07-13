package com.example.foodapp.domain.use_cases

import com.example.foodapp.domain.models.RecommendationsEvent
import com.example.foodapp.domain.repositoreis.FootRepository

class FetchAllRecommendationsEventsUseCase (
    private val repository: FootRepository
        ){
    operator fun invoke(): List<RecommendationsEvent>{
        return repository.fetchAllRecommendationsEvents()
    }

}