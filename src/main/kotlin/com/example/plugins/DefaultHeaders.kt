package com.example.plugins

import io.ktor.http.HttpHeaders.CacheControl
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*
import java.net.http.HttpHeaders
import java.time.Duration


fun Application.configureDefaultHeader() {
    install(DefaultHeaders) {
        val oneYearInSeconds = Duration.ofDays(365).seconds
        header(
            name = CacheControl,
            value = "public, max-age=$oneYearInSeconds, immutable"
        )
    }
}