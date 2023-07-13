package com.example.foodapp.domain.models

import java.io.Serializable

data class Recipe (
    val id: String,
    val title: String,
    val imageUrl: String,
    val isSaved: Boolean,
    val description: String,
    val rating: Float,
    val cook: Cook,
    val ingredients: List<Ingredient>,
) : Serializable


