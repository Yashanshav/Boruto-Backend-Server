package com.example.Repository

import com.example.models.ApiResponse
import com.example.models.Hero

class HeroRepositoryImplementation: HeroRepository {
    override val hereos: Map<Int, List<Hero>>
        get() = TODO("Not yet implemented")
    override val page1: List<Hero>
        get() = TODO("Not yet implemented")
    override val page2: List<Hero>
        get() = TODO("Not yet implemented")
    override val page3: List<Hero>
        get() = TODO("Not yet implemented")
    override val page4: List<Hero>
        get() = TODO("Not yet implemented")
    override val page5: List<Hero>
        get() = TODO("Not yet implemented")

    override suspend fun getAllHereos(page: Int): ApiResponse {
        TODO("Not yet implemented")
    }

    override suspend fun searchAllHereos(name: String): ApiResponse {
        TODO("Not yet implemented")
    }
}