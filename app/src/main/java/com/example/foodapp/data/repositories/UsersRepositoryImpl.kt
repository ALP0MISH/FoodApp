package com.example.foodapp.data.repositories

import com.example.foodapp.domain.models.User
import com.example.foodapp.domain.repositoreis.UsersRepository

class UsersRepositoryImpl : UsersRepository {

  override  fun fetchCurrentUser(): User {
        return User(
            id = "1",
            name = "ALPOMISH",
            lastName = "Gziev",
            avatarUrl = "https://pixelbox.ru/wp-content/uploads/2021/09/avatar-boys-vk-60-scaled.jpg"
        )
    }
}