package com.example.foodapp.domain.repositoreis

import com.example.foodapp.domain.models.User

interface UsersRepository {

    fun fetchCurrentUser():User
}