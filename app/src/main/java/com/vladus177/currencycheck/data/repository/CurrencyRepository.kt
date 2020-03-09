package com.vladus177.currencycheck.data.repository

import com.vladus177.currencycheck.data.local.source.CurrencyLocalDataSource
import com.vladus177.currencycheck.data.remote.source.CurrencyRemoteDataSource
import com.vladus177.currencycheck.domain.model.CurrencyResponseModel

class CurrencyRepository(
    private val currencyLocalDataSource: CurrencyLocalDataSource,
    private val currencyRemoteDataSource: CurrencyRemoteDataSource
) {
    suspend fun getLocalCurrencyRates(code: String) {

    }

    suspend fun getRemoteCurrencyRates(currencyCode: String): CurrencyResponseModel? {

        return CurrencyResponseModel("")

    }
}