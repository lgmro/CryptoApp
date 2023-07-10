package com.lgmro.cryptoapp.di

import com.lgmro.cryptoapp.data.remote.CoinPaprikaApi
import org.koin.dsl.module
import retrofit2.Retrofit

val serviceModule = module {
    single { get<Retrofit>().create(CoinPaprikaApi::class.java) }
}