package com.example.foodapp.presentation.main_screen.view_pager

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodapp.databinding.FragmentMainBinding
import com.example.foodapp.databinding.ItemRecommendationEventBinding
import com.example.foodapp.domain.models.RecommendationsEvent

class ViewPagerViewHolder(
    private val binding: ItemRecommendationEventBinding
):RecyclerView.ViewHolder(binding.root) {

    fun bind(event: RecommendationsEvent) = with(binding) {
        titleTextView.text = event.title

        Glide.with(root.context)
            .load(event.imageUrl)
            .into(backgrountImageView)
    }


}