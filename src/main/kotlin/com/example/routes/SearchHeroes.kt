package com.example.routes

import com.example.Repository.HeroRepository
import com.example.models.Hero
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchHeroes() {
    val heroRepository: HeroRepository by inject()

    get("/boruto/heroes/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = heroRepository.searchAllHereos(name = name!!)
        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}