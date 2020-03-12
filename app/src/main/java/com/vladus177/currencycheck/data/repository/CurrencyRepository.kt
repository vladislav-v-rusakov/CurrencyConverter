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

    var cachedRates: RatesModel? = null

    suspend fun getLocalCurrencyRates(code: String) {

    }

    suspend fun getRemoteCurrencyRates(currencyCode: String?, forceUpdate: Boolean): RatesModel? {
        if (forceUpdate) {
            val response = currencyRemoteDataSource.getCurrencyRates(currencyCode)
            val rates = with(dataMapper) { response?.fromDataToDomain() }
            saveRatesToCache(rates)
            return rates
        } else {
            if (cachedRates == null) {
                val response = currencyRemoteDataSource.getCurrencyRates(currencyCode)
                val rates = with(dataMapper) { response?.fromDataToDomain() }
                saveRatesToCache(rates)
                return rates
            } else {
                return cachedRates
            }
        }
    }

    private fun saveRatesToCache(model: RatesModel?) {
        cachedRates = model
    }
}