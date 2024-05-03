package com.hoc081098.kmpapp.di

import com.hoc081098.kmpapp.data.InMemoryMuseumStorage
import com.hoc081098.kmpapp.data.KtorMuseumApi
import com.hoc081098.kmpapp.data.MuseumApi
import com.hoc081098.kmpapp.data.MuseumRepository
import com.hoc081098.kmpapp.data.MuseumStorage
import com.hoc081098.kmpapp.screens.detail.DetailScreenViewModel
import com.hoc081098.kmpapp.screens.list.ListScreenViewModel
import com.hoc081098.solivagant.navigation.NavEventNavigator
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val dataModule = module {
    single {
        val json = Json { ignoreUnknownKeys = true }
        HttpClient {
            install(ContentNegotiation) {
                // TODO Fix API so it serves application/json
                json(json, contentType = ContentType.Any)
            }
        }
    }

    single<MuseumApi> { KtorMuseumApi(get()) }
    single<MuseumStorage> { InMemoryMuseumStorage() }
    single {
        MuseumRepository(get(), get()).apply {
            initialize()
        }
    }
}

val viewModelsModule = module {
    factoryOf(::ListScreenViewModel)
    factoryOf(::DetailScreenViewModel)
}

val navigationModule = module {
    singleOf(::NavEventNavigator)
}

fun initKoin() {
    startKoin {
        modules(
            dataModule,
            viewModelsModule,
            navigationModule,
        )
    }
}
