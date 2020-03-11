package com.vladus177.currencycheck.data.remote.net

import com.vladus177.currencycheck.data.remote.model.CurrencyResponseEntry
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/api/android/latest")
    suspend fun getCurrencyRates(@Query("base") base: String): CurrencyResponseEntry
}