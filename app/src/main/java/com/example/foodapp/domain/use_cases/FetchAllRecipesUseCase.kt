package com.example.foodapp.domain.use_cases

import com.example.foodapp.domain.models.Recipe
import com.example.foodapp.domain.repositoreis.FootRepository

class FetchAllRecipesUseCase(
    private val repository: FootRepository
) {

    operator fun invoke(): List<Recipe> {
        return repository.fetchAllRecipes()
    }
}

