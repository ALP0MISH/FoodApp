package com.example.foodapp.presentation.main_screen.recycle_view.food_category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodapp.R
import com.example.foodapp.databinding.ItemFoodCategoryBinding
import com.example.foodapp.domain.models.FoodCategory

class FootCategoryAdapter:RecyclerView.Adapter<FoodCategoryViewHolder>() {

    private val category = mutableListOf<FoodCategory>()

    fun updateData(newList: List<FoodCategory>){
        category.clear()
        category.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):FoodCategoryViewHolder  {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_food_category, parent,false)
        val binding = ItemFoodCategoryBinding.bind(view)
        return FoodCategoryViewHolder(binding)
    }


    override fun getItemCount(): Int = category.size



    override fun onBindViewHolder(holder: FoodCategoryViewHolder, position: Int) {
        holder.bind(category[position])
    }

}
