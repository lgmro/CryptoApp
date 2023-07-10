package com.lgmro.cryptoapp.di

import com.lgmro.cryptoapp.domain.use_case.get_coin.GetCoinUseCase
import com.lgmro.cryptoapp.domain.use_case.get_coin.GetCoinUseCaseImpl
import com.lgmro.cryptoapp.domain.use_case.get_coins.GetCoinsUseCase
import com.lgmro.cryptoapp.domain.use_case.get_coins.GetCoinsUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {
    @Binds
    @Singleton
    abstract fun bindGetCoinUeCase(getCoinUseCaseImpl: GetCoinUseCaseImpl): GetCoinUseCase

    @Binds
    @Singleton
    abstract fun bindGetCoinsUseCase(getCoinsUseCaseImpl: GetCoinsUseCaseImpl): GetCoinsUseCase
}