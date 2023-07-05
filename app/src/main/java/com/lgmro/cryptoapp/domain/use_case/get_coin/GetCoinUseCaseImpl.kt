package com.lgmro.cryptoapp.domain.use_case.get_coin

import com.lgmro.cryptoapp.common.Resource
import com.lgmro.cryptoapp.data.remote.dto.toCoinDetail
import com.lgmro.cryptoapp.domain.model.CoinDetail
import com.lgmro.cryptoapp.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCaseImpl @Inject constructor(
    private val repository: CoinRepository
) : GetCoinUseCase {
    override fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
        }
    }
}