package com.vladus177.currencycheck.data.remote.source

import com.vladus177.currencycheck.data.remote.model.CurrencyResponseEntry
import com.vladus177.currencycheck.data.remote.net.CurrencyApi

open class CurrencyRemoteDataSource (
    private val currencyApi: CurrencyApi
) {
    suspend fun getCurrencyRates(currencyCode: String?): CurrencyResponseEntry? {
        return currencyApi.getCurrencyRates(currencyCode)
    }
}