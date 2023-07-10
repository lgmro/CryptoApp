package com.lgmro.cryptoapp.di

import com.lgmro.cryptoapp.data.repository.CoinRepositoryImpl
import com.lgmro.cryptoapp.domain.repository.CoinRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<CoinRepository> { CoinRepositoryImpl(get()) }
}