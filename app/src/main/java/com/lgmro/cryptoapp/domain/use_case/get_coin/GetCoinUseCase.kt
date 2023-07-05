package com.lgmro.cryptoapp.domain.use_case.get_coin

import com.lgmro.cryptoapp.common.Resource
import com.lgmro.cryptoapp.domain.model.CoinDetail
import kotlinx.coroutines.flow.Flow


interface GetCoinUseCase {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>>
}