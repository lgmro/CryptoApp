package com.lgmro.cryptoapp.domain.use_case.get_coins

import com.lgmro.cryptoapp.common.Resource
import com.lgmro.cryptoapp.domain.model.Coin
import kotlinx.coroutines.flow.Flow


interface GetCoinsUseCase {
    operator fun invoke(): Flow<Resource<List<Coin>>>
}