package com.lgmro.cryptoapp.di

import com.lgmro.cryptoapp.domain.use_case.get_coin.GetCoinUseCase
import com.lgmro.cryptoapp.domain.use_case.get_coin.GetCoinUseCaseImpl
import com.lgmro.cryptoapp.domain.use_case.get_coins.GetCoinsUseCase
import com.lgmro.cryptoapp.domain.use_case.get_coins.GetCoinsUseCaseImpl
import org.koin.dsl.module

val useCaseModule = module {
    single<GetCoinsUseCase> { GetCoinsUseCaseImpl(get()) }
    single<GetCoinUseCase> { GetCoinUseCaseImpl(get()) }
}