package com.vladus177.currencycheck.domain

import com.vladus177.currencycheck.common.ResultUseCase
import com.vladus177.currencycheck.data.repository.CurrencyRepository
import com.vladus177.currencycheck.domain.model.CurrencyRequestParam
import com.vladus177.currencycheck.domain.model.CurrencyResponseModel
import kotlinx.coroutines.Dispatchers

class GetUsdUseCase(
    private val currencyRepository: CurrencyRepository
) : ResultUseCase<CurrencyRequestParam, CurrencyResponseModel>(
    backgroundContext = Dispatchers.IO,
    foregroundContext = Dispatchers.Main
) {
    override suspend fun executeOnBackground(params: CurrencyRequestParam): CurrencyResponseModel? {
        val remoteResults = currencyRepository.getRemoteCurrencyRates(params.currencyCode)
        return remoteResults
    }
}