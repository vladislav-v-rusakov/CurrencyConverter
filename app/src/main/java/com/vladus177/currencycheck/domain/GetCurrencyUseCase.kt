package com.vladus177.currencycheck.domain

import com.vladus177.currencycheck.common.ResultUseCase
import com.vladus177.currencycheck.data.repository.CurrencyRepository
import com.vladus177.currencycheck.domain.model.CurrencyRequestParam
import com.vladus177.currencycheck.domain.model.RatesModel
import kotlinx.coroutines.Dispatchers

class GetCurrencyUseCase(
    private val currencyRepository: CurrencyRepository
) : ResultUseCase<CurrencyRequestParam, RatesModel>(
    backgroundContext = Dispatchers.IO,
    foregroundContext = Dispatchers.Main
) {
    override suspend fun executeOnBackground(params: CurrencyRequestParam): RatesModel? {
        return currencyRepository.getRemoteCurrencyRates(params.currencyCode, params.forceUpdate)
    }
}