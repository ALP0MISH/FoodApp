package com.example.foodapp.presentation.main_screen.recycle_view.listeners

import com.example.foodapp.domain.models.Recipe

interface RecipeItemOnClickListener {

        fun onRecipeClick(recipe: Recipe)
    }
