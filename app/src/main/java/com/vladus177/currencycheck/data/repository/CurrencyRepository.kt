package com.vladus177.currencycheck.data.repository

import com.vladus177.currencycheck.data.CurrencyDataMapper
import com.vladus177.currencycheck.data.local.source.CurrencyLocalDataSource
import com.vladus177.currencycheck.data.remote.source.CurrencyRemoteDataSource
import com.vladus177.currencycheck.domain.model.RatesModel

class CurrencyRepository(
    private val currencyLocalDataSource: CurrencyLocalDataSource,
    private val currencyRemoteDataSource: CurrencyRemoteDataSource,
    private val dataMapper: CurrencyDataMapper
) {
    suspend fun getLocalCurrencyRates(code: String) {

    }

    suspend fun getRemoteCurrencyRates(currencyCode: String?): RatesModel? {
        val response = currencyRemoteDataSource.getCurrencyRates(currencyCode)

        return with(dataMapper) { response?.fromDataToDomain() }

    }
}