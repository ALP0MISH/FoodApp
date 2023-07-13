package com.example.foodapp.presentation.recipe_screen

import IngredientsAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.foodapp.databinding.FragmentRecipeDitailsBinding
import com.example.foodapp.domain.models.Recipe

class  FragmentRecipeDetails : Fragment() {
    private val binding:FragmentRecipeDitailsBinding by lazy {
        FragmentRecipeDitailsBinding.inflate(layoutInflater)
    }
    private val recipe: Recipe by lazy {
        FragmentRecipeDetailsArgs.fromBundle(requireArguments()).resipe
    }
    private val ingredientsAdapter:IngredientsAdapter by lazy {
        IngredientsAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }
    private fun initViews() = with(binding){
        loadImageByUrl(
            imageUrl = recipe.imageUrl,
            imageView = recipeDetailsHeader.recipeImageView
        )
        loadImageByUrl(
            imageUrl = recipe.cook.avatarUrl,
            imageView = recipeDetailsHeader.cookImageView
        )
        recipeDetailsHeader.cookNameTextView.text = recipe.cook.name
        recipeDetailsContent.ingredientCountTextView.text = recipe.ingredients.count().toString()
        recipeDetailsContent.recipeDescriptionTextView.text = recipe.description
        recipeDetailsContent.recipeTitleTextView.text = recipe.title
        recipeDetailsContent.ingredientRecycleView.adapter = ingredientsAdapter
        ingredientsAdapter.updateData(recipe.ingredients)
    }

    private fun loadImageByUrl(imageUrl: String, imageView: ImageView) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}