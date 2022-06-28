package com.example.Repository

import com.example.models.ApiResponse
import com.example.models.Hero

interface HeroRepository {

    val hereos: Map<Int, List<Hero>>

    val page1: List<Hero>
    val page2: List<Hero>
    val page3: List<Hero>
    val page4: List<Hero>
    val page5: List<Hero>

    suspend fun getAllHereos(page: Int = 1): ApiResponse
    suspend fun searchAllHereos(name: String): ApiResponse
}