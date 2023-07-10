package com.lgmro.cryptoapp.di

import com.lgmro.cryptoapp.presentation.coin_detail.CoinDetailViewModel
import com.lgmro.cryptoapp.presentation.coin_list.CoinListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { CoinListViewModel(get()) }
    viewModel { CoinDetailViewModel(get(), get()) }
}