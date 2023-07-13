package com.example.foodapp.presentation.onboarding_screen.ingredient

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodapp.databinding.ItemIngredientBinding
import com.example.foodapp.databinding.ItemRecipeBinding
import com.example.foodapp.domain.models.Ingredient
import com.example.foodapp.domain.models.Recipe
import com.example.foodapp.presentation.main_screen.recycle_view.listeners.RecipeItemOnClickListener

class IngredientViewHolder(
    private val binding: ItemIngredientBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(ingredient: Ingredient) = with(binding) {
        ingredientTextView.text = ingredient.title
        val count = "${ingredient.count}${ingredient.countType}"
        ingredientCountTextView.text = count
        loadImageByUrl(
            imageUrl = ingredient.imageUrl,
            imageView = ingredientImageView
        )
    }

    private fun loadImageByUrl(imageUrl: String, imageView: ImageView) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}