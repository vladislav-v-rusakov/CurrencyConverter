package com.vladus177.currencycheck.data.remote.net

import com.vladus177.currencycheck.common.Response
import com.vladus177.currencycheck.data.remote.model.CurrencyResponseEntry
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/latest")
    fun getCurrencyRates(@Query("code") code: String
    ): Call<Response<CurrencyResponseEntry>>
}