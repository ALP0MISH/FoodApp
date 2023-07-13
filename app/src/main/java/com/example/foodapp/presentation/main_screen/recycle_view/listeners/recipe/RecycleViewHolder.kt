package com.example.foodapp.presentation.main_screen.recycle_view.listeners.recipe

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodapp.databinding.ItemRecipeBinding
import com.example.foodapp.domain.models.Recipe
import com.example.foodapp.presentation.main_screen.recycle_view.listeners.RecipeItemOnClickListener

class RecycleViewHolder(
    private val binding: ItemRecipeBinding,
    private val listener: RecipeItemOnClickListener

) : RecyclerView.ViewHolder(binding.root) {

    fun bind(recipe: Recipe) = with(binding) {
        root.setOnClickListener { listener.onRecipeClick(recipe) }
        textTitle.text = recipe.title
        ratingText.text = recipe.title

        loadImageByUrl(
            imageUrl = recipe.imageUrl,
            imageView = backgrountImageView
        )
        loadImageByUrl(
            imageUrl = recipe.cook.avatarUrl,
            imageView = cookImageView
        )
    }


    private fun loadImageByUrl(imageUrl: String, imageView: ImageView) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}