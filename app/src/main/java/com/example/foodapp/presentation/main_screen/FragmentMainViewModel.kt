package com.example.foodapp.presentation.main_screen

import androidx.lifecycle.ViewModel
import com.example.foodapp.data.repositories.FootRepositoryImpl
import com.example.foodapp.data.repositories.UsersRepositoryImpl
import com.example.foodapp.domain.models.FoodCategory
import com.example.foodapp.domain.models.Recipe
import com.example.foodapp.domain.models.RecommendationsEvent
import com.example.foodapp.domain.models.User
import com.example.foodapp.domain.repositoreis.FootRepository
import com.example.foodapp.domain.repositoreis.UsersRepository
import com.example.foodapp.domain.use_cases.FetchAllFoodCategories
import com.example.foodapp.domain.use_cases.FetchAllRecipesUseCase
import com.example.foodapp.domain.use_cases.FetchAllRecommendationsEventsUseCase
import com.example.foodapp.domain.use_cases.FetchCurrentUserCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class MainFragmentUiState(
    val recommendationsEvent: List<RecommendationsEvent> = emptyList(),
    val recipe: List<Recipe> = emptyList(),
    val foodCategories: List<FoodCategory> = emptyList(),
    val currentUser: User =User.unknown()

)

class FragmentMainViewModel : ViewModel() {

    private val repository: FootRepository = FootRepositoryImpl()
    private val usersRepository: UsersRepository = UsersRepositoryImpl()
    private val fetchAllRecommendationsEventsUseCase = FetchAllRecommendationsEventsUseCase(repository)
    private val fetchAllRecipesUseCase = FetchAllRecipesUseCase(repository)
    private val fetchAllFoodCategories = FetchAllFoodCategories(repository)
    private val fetchCurrentUserCase = FetchCurrentUserCase(usersRepository)

    private val _uiStateFlow:MutableStateFlow<MainFragmentUiState> = MutableStateFlow(MainFragmentUiState())
    val uiStateFlow:StateFlow<MainFragmentUiState> = _uiStateFlow.asStateFlow()

    init {
        val recommendationsEvent = fetchAllRecommendationsEventsUseCase.invoke()
        val recipes = fetchAllRecipesUseCase.invoke()
        val foodCategories = fetchAllFoodCategories.invoke()
        val currentUser = fetchCurrentUserCase.invoke()
        val uiState = MainFragmentUiState(
            recommendationsEvent = recommendationsEvent,
            recipe = recipes,
            foodCategories = foodCategories,
            currentUser = currentUser
        )
        _uiStateFlow.tryEmit(uiState)
    }

}