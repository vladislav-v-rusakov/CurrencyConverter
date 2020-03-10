package com.vladus177.currencycheck.data.remote.model

import com.google.gson.annotations.SerializedName
import com.vladus177.currencycheck.data.DataConstant.BASE_CURRENCY
import com.vladus177.currencycheck.data.DataConstant.RATES

data class CurrencyResponseEntry(
    @SerializedName(BASE_CURRENCY) val baseCurrency: String?,
    @SerializedName(RATES) val rates: Map<String, RatesEntry>?
)
