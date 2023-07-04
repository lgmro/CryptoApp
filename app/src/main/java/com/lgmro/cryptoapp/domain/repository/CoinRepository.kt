package com.lgmro.cryptoapp.domain.repository

import com.lgmro.cryptoapp.data.remote.dto.CoinDetailDto
import com.lgmro.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}