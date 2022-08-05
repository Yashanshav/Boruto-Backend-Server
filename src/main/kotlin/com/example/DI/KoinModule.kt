package com.example.DI

import com.example.repository.HeroRepository
import com.example.repository.HeroRepositoryImplementation
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImplementation()
    }
}