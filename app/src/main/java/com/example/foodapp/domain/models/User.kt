package com.example.foodapp.domain.models

data class User(
    val id: String,
    val name: String,
    val lastName: String,
    val avatarUrl: String,
){
    companion object{
        fun unknown() = User(
            id = "1",
            name = "UnKnown",
            lastName = "",
            avatarUrl = "https://avatars.mds.yandex.net/i?id=bd200a0eb7e2dcfa7462d3c33c8c141db85098c0-4592245-images-thumbs&n=13"
        )
    }
}
