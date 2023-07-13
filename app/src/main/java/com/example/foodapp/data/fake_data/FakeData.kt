package com.example.foodapp.data.fake_data

import com.example.foodapp.domain.models.Cook
import com.example.foodapp.domain.models.FoodCategory
import com.example.foodapp.domain.models.Ingredient
import com.example.foodapp.domain.models.Recipe
import com.example.foodapp.domain.models.RecommendationsEvent
import java.util.UUID

class FakeData {

    companion object {

        fun fakeCooks() = listOf(
            Cook(
                UUID.randomUUID().toString(),
                name = "Joseph",
                lastName = "Barbera",
                avatarUrl = "https://cdn4.iconfinder.com/data/icons/people-of-service/512/People_Services_chef_man-1024.png"
            ),
            Cook(
                UUID.randomUUID().toString(),
                name = "Gordon",
                lastName = "Ramsey",
                avatarUrl = "https://cdn4.iconfinder.com/data/icons/people-of-service/512/People_Services_chef_man-1024.png"
            ),
        )

        fun fakeFoodCategory() = listOf(
            FoodCategory(
                id = UUID.randomUUID().toString(),
                title = "Pizza",
                imageUrl = "https://avatars.mds.yandex.net/i?id=a01bbf68baecb955aa47f7c84be712749240a06b-4079503-images-thumbs&n=13",
                recipesIds = listOf()
            ),
            FoodCategory(
                id = UUID.randomUUID().toString(),
                title = "Salad",
                imageUrl = "https://avatars.mds.yandex.net/i?id=611983779106df61761ba20d9a1032cc97c6f1a9-9182266-images-thumbs&n=13",
                recipesIds = listOf()
            ),
            FoodCategory(
                id = UUID.randomUUID().toString(),
                title = "Burgers",
                imageUrl = "https://avatars.mds.yandex.net/i?id=f5c2b69aa6c4ce7dd67011f7e39872543fbe5e2f-8744212-images-thumbs&n=13",
                recipesIds = listOf()
            ),
            FoodCategory(
                id = UUID.randomUUID().toString(),
                title = "Pasta",
                imageUrl = "https://avatars.mds.yandex.net/i?id=56ef51e77423e9cf90b502bae98ac7a6c5b64b80-9244753-images-thumbs&n=13",
                recipesIds = listOf()
            ),
            FoodCategory(
                id = UUID.randomUUID().toString(),
                title = "Pasta",
                imageUrl = "https://i.pinimg.com/originals/f7/b5/78/f7b578cfd73d46dc5f21fd1f8a46ab99.jpg",
                recipesIds = listOf()
            ),
        )

        fun fakeIngredients() = listOf(
            Ingredient(
                id = UUID.randomUUID().toString(),
                title = "soft flour tortilla",
                imageUrl = "https://static.tildacdn.com/tild6263-3133-4430-a436-333732373830/lavas.png",
                count = 4,
                countType = "g"
            ),
            Ingredient(
                id = UUID.randomUUID().toString(),
                title = "teaspoon olive oil",
                imageUrl = "https://media.baamboozle.com/uploads/images/120834/1607455116_123878",
                count = 3,
                countType = "g"
            ),
            Ingredient(
                id = UUID.randomUUID().toString(),
                title = "pinch garlic powder",
                imageUrl = "https://www.spiceography.com/wp-content/uploads/2021/02/How-to-Dry-Garlic.jpg",
                count = 1,
                countType = "g"
            ),
            Ingredient(
                id = UUID.randomUUID().toString(),
                title = "salt and black pepper",
                imageUrl = "https://i2.wp.com/photos.demandstudios.com/getty/article/178/41/89675163.jpg",
                count = 1,
                countType = "g"
            ),
        )


        fun fakeRecipes() = listOf(
            Recipe(
                id = UUID.randomUUID().toString(),
                title = "Perfect Chicken",
                description = "Flavorful chicken broth, crunchy chopped onions, earthy mushrooms, and savory spices all come together to create the most perfect chicken dish ever. Recipe creator Faith recommends that to really take this dish to the next level, it can be served with mushroom rice and asparagus.",
                imageUrl = "https://www.allrecipes.com/thmb/7Im4a9LWOwEA8j2he3Z_cgm3U6k=/750x0/filters:no_upscale():max_bytes(150000):strip_icc()/216159-perfect-chicken-DDMFS-1x1-1-310f12f531c2461ebb02fb277339f5e8.jpg",
                rating = 5f,
                cook = fakeCooks().random(),
                ingredients = fakeIngredients(),
                isSaved = false
            ),
            Recipe(
                id = UUID.randomUUID().toString(),
                title = "Johnny Marzetti Casserole",
                description = "This Johnny Marzetti Casserole is one top-tier dish that you simply won't be able to get enough of. From the tender rotini pasta, zesty ground beef, and delectable veggies, this recipe isn't just bursting with flavor but is the perfect winter meal to make.",
                imageUrl = "https://www.allrecipes.com/thmb/pejyq3jXuAU3t2NYlt1hDwAmMFg=/750x0/filters:no_upscale():max_bytes(150000):strip_icc()/1127173-496aaee28b894de0ad6d11ed6d155130.jpg",
                rating = 4.7f,
                cook =  fakeCooks().random(),
                ingredients = fakeIngredients(),
                isSaved = false
            ),
            Recipe(
                id = UUID.randomUUID().toString(),
                title = "Million Dollar Chicken Casserole",
                description = "Another high-quality casserole that was a hit with our audience was this Million Dollar Chicken. Whether you're looking for a hearty casserole to make for your family or looking to change up your dinner plans, this is the ideal dish because, with each bite, you'll be tasting tender pieces of rotisserie chicken, mozzarella cheese, scallions, and pure comfort.",
                imageUrl = "https://www.allrecipes.com/thmb/4G9E4S8MTyTZp7Nq05RezHeDVZc=/750x0/filters:no_upscale():max_bytes(150000):strip_icc()/MillionDollarChickenCasserole-ddmfs-4X3-2912-822dda92116b4ccdbebfb273ae90687b.jpg",
                rating = 4.4f,
                cook = fakeCooks().random(),
                ingredients = fakeIngredients(),
                isSaved = false
            ),
            Recipe(
                id = UUID.randomUUID().toString(),
                title = "Spaghetti Carbonara",
                description = "Leave your dinner guests speechless with this appetizing Spaghetti Carbonara! Whether you're just diving into the world of tantalizing pasta dishes or are a seasoned pro, you can't argue with the deliciousness of creamy pasta.",
                imageUrl = "https://www.allrecipes.com/thmb/s-9f1knegzRIK6FTj2s9ScApSKI=/750x0/filters:no_upscale():max_bytes(150000):strip_icc()/187850-051a44c98bb3421fa4f9b13a14825410.jpg",
                rating = 4.3f,
                cook = fakeCooks().random(),
                ingredients = fakeIngredients(),
                isSaved = false
            ),
            Recipe(
                id = UUID.randomUUID().toString(),
                title = "The Secret to Fluffy Scrambled Eggs",
                description = "With our secret to fluffy scrambled eggs, you'll never have to worry about making burnt eggs ever again. And once you're through making these fluffy eggs, top them with the herb of your choice.",
                imageUrl = "https://www.allrecipes.com/thmb/k3UT4ndiq2FBiaPtwa3tpC9U1DU=/750x0/filters:no_upscale():max_bytes(150000):strip_icc()/9175615-d4753b6d3b284a21b622bd38c94f97f3.jpg",
                rating = 4.1f,
                cook = fakeCooks().random(),
                ingredients = fakeIngredients(),
                isSaved = false


        ),
        Recipe(
        id = UUID.randomUUID().toString(),
        title = "Easy Cinnamon Rolls",
        description = "There's no better way to get your morning started than with a warm cinnamon roll that's been topped with sweet, gooey icing. Not only is our recipe better than the store-bought ones but they go great with a warm cup of coffee.",
        imageUrl = "https://www.allrecipes.com/thmb/W4oLXcJn3xXgPPgTgXAggXZPIaM=/750x0/filters:no_upscale():max_bytes(150000):strip_icc()/229276-easy-cinnamon-rolls-DDMFS-1x1-1-27adb7272d3b4d9b85484291800db65e.jpg",
        rating = 4.8f,
        cook = fakeCooks().random(),
        ingredients = fakeIngredients(),
        isSaved = false
        ),
        )

        fun fakeRecommendationsEvents() = listOf(
            RecommendationsEvent(
                id = UUID.randomUUID().toString(),
                title = "Best rated recipes",
                imageUrl = "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/jambalaya-e498a3d.jpg?quality=90&webp=true&resize=400,363"
            ),
            RecommendationsEvent(
                id = UUID.randomUUID().toString(),
                title = "Our 10 Most Popular Recipes You Loved Cooking in 2021",
                imageUrl = "https://miro.medium.com/v2/resize:fit:1400/0*hB9TsIm1rdkt_idb"
            ),
            RecommendationsEvent(
                id = UUID.randomUUID().toString(),
                title = "Our 20 Most Popular Recipes of 2022",
                imageUrl = "https://natashaskitchen.com/wp-content/uploads/2023/01/Most-Popular-Recipes-of-2022.jpg"
            ),
            RecommendationsEvent(
                id = UUID.randomUUID().toString(),
                title = "Meatloaf Recipe with the Best Glaze",
                imageUrl = "https://natashaskitchen.com/wp-content/uploads/2019/02/Meatloaf-Recipe.jpg"
            ),
        )
    }
}


