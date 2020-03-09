package com.vladus177.currencycheck.data.remote.source

import com.vladus177.currencycheck.common.Response
import com.vladus177.currencycheck.data.remote.model.CurrencyResponseEntry
import com.vladus177.currencycheck.data.remote.net.CurrencyApi
import retrofit2.await

open class CurrencyRemoteDataSource (
    private val currencyApi: CurrencyApi
) {
    suspend fun getCurrencyRates(currencyCode: String): Response<CurrencyResponseEntry>? {
        return currencyApi.getCurrencyRates(currencyCode).await()
    }
}