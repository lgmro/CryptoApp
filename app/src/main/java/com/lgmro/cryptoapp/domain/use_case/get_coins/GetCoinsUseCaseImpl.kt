package com.lgmro.cryptoapp.domain.use_case.get_coins

import com.lgmro.cryptoapp.common.Resource
import com.lgmro.cryptoapp.data.remote.dto.toCoin
import com.lgmro.cryptoapp.domain.model.Coin
import com.lgmro.cryptoapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class GetCoinsUseCaseImpl(
    private val repository: CoinRepository
) : GetCoinsUseCase {
    override fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success(coins))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}