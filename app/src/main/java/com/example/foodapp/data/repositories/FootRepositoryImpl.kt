package com.example.foodapp.data.repositories

import com.example.foodapp.data.fake_data.FakeData
import com.example.foodapp.domain.models.FoodCategory
import com.example.foodapp.domain.models.Recipe
import com.example.foodapp.domain.models.RecommendationsEvent
import com.example.foodapp.domain.repositoreis.FootRepository

class FootRepositoryImpl: FootRepository {
    override fun fetchAllRecommendationsEvents():
            List<RecommendationsEvent> {
         return FakeData.fakeRecommendationsEvents()
    }

    override fun fetchAllRecipes(): List<Recipe> {
        return FakeData.fakeRecipes()
    }

    override fun fetchAllFoodCategoreis(): List<FoodCategory> {
        return FakeData.fakeFoodCategory()
    }
}