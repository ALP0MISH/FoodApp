package com.example.foodapp.presentation.main_screen.recycle_view.listeners.recipe

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.R
import com.example.foodapp.databinding.ItemRecipeBinding
import com.example.foodapp.domain.models.Recipe
import com.example.foodapp.presentation.main_screen.recycle_view.listeners.RecipeItemOnClickListener

class RecipeAdapter(
    private val listener: RecipeItemOnClickListener
):RecyclerView.Adapter<RecycleViewHolder>() {
    private val recipes = mutableListOf<Recipe>()

    fun updateData(newList: List<Recipe>){
        recipes.clear()
        recipes.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_recipe, parent,false)
        val binding = ItemRecipeBinding.bind(view)
        return RecycleViewHolder(binding, listener)
    }


    override fun getItemCount(): Int = recipes.size



    override fun onBindViewHolder(holder: RecycleViewHolder, position: Int) {
        holder.bind(recipes[position])
    }

}
