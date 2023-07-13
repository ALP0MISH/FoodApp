package com.example.foodapp.domain.repositoreis

import com.example.foodapp.domain.models.FoodCategory
import com.example.foodapp.domain.models.Recipe
import com.example.foodapp.domain.models.RecommendationsEvent

interface FootRepository {

    fun fetchAllRecommendationsEvents(): List<RecommendationsEvent>

    fun fetchAllRecipes(): List<Recipe>

    fun fetchAllFoodCategoreis(): List<FoodCategory>
}