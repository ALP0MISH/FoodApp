package com.example.foodapp.domain.use_cases

import com.example.foodapp.domain.models.FoodCategory
import com.example.foodapp.domain.repositoreis.FootRepository

class FetchAllFoodCategories(
    private val repository: FootRepository
) {

    operator fun invoke(): List<FoodCategory>{
        return repository.fetchAllFoodCategoreis()
    }
}