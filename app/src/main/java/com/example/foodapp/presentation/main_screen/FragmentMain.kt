package com.example.foodapp.presentation.main_screen

import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import android.widget.SearchView
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.example.foodapp.R
import com.example.foodapp.databinding.FragmentMainBinding
import com.example.foodapp.domain.models.Recipe
import com.example.foodapp.domain.models.User
import com.example.foodapp.presentation.main_screen.recycle_view.listeners.recipe.RecipeAdapter
import com.example.foodapp.presentation.main_screen.recycle_view.food_category.FootCategoryAdapter
import com.example.foodapp.presentation.main_screen.recycle_view.listeners.RecipeItemOnClickListener
import com.example.foodapp.presentation.main_screen.view_pager.ViewPagerAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class FragmentMain : Fragment(), RecipeItemOnClickListener {

    private val binding: FragmentMainBinding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }

    private val viewModel: FragmentMainViewModel by viewModels()

    private val viewPagerAdapter: ViewPagerAdapter by lazy {
        ViewPagerAdapter()
    }

    private val recipeAdapter: RecipeAdapter by lazy {
        RecipeAdapter(this)
    }

    private val categoryAdapter: FootCategoryAdapter by lazy {
        FootCategoryAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = binding.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mainContent.viewPager.adapter = viewPagerAdapter
        setupSearchView()
        initView()
        observeData()
    }

    private fun initView() = with(binding) {
        mainContent.viewPager.adapter = viewPagerAdapter
        mainContent.recyclerView.adapter = recipeAdapter
        mainContent.foodCategoryRecycleView.adapter = categoryAdapter
    }

    private fun setupSearchView() {
        binding.mainContent.searchView.setupSearchViewParams()
    }

    private fun observeData() {
        viewModel.uiStateFlow.onEach { uiState ->
            viewPagerAdapter.updateData(uiState.recommendationsEvent)
            recipeAdapter.updateData(uiState.recipe)
            categoryAdapter.updateData(uiState.foodCategories)
            showUserInfo(uiState.currentUser)
        }.launchIn(lifecycleScope)
    }
    private fun showUserInfo(user: User){
        Glide.with(requireActivity())
            .load(user.avatarUrl)
            .into(binding.mainTopContent.avatarImageView)

    }

    override fun onRecipeClick(recipe: Recipe) {
        findNavController().navigate(FragmentMainDirections.actionFragmentMainToFragmentRecipeDitails(recipe))
    }
}


fun SearchView.setupSearchViewParams() {
    val searchText = this.findViewById<View>(
        this.context.resources.getIdentifier(
            "android:id/search_src_text",
            null,
            null
        )
    ) as AutoCompleteTextView
    searchText.setTextSize(
        TypedValue.COMPLEX_UNIT_PX,
        resources.getDimensionPixelSize(R.dimen.texySizeForSmallTexts).toFloat()
    )
    val typeface = ResourcesCompat.getFont(this.context, R.font.inter_light)
    searchText.typeface = typeface
}