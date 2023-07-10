package com.lgmro.cryptoapp.data.repository

import com.lgmro.cryptoapp.data.remote.CoinPaprikaApi
import com.lgmro.cryptoapp.data.remote.dto.CoinDetailDto
import com.lgmro.cryptoapp.data.remote.dto.CoinDto
import com.lgmro.cryptoapp.domain.repository.CoinRepository

class CoinRepositoryImpl(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}