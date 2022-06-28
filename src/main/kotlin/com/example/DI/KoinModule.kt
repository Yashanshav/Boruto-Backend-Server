package com.example.DI

import com.example.Repository.HeroRepository
import com.example.Repository.HeroRepositoryImplementation
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImplementation()
    }
}