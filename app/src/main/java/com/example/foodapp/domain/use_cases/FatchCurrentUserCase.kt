package com.example.foodapp.domain.use_cases

import com.example.foodapp.domain.models.User
import com.example.foodapp.domain.repositoreis.UsersRepository

class FetchCurrentUserCase (
    private val repository: UsersRepository
){
    operator fun invoke(): User{
        return repository.fetchCurrentUser()
    }
}