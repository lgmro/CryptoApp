package com.lgmro.cryptoapp.presentation.coin_detail

import com.lgmro.cryptoapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
