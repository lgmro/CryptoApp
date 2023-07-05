package com.lgmro.cryptoapp.presentation.coin_list

import com.lgmro.cryptoapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
