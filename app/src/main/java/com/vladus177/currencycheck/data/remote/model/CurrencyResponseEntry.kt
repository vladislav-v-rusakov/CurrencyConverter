package com.vladus177.currencycheck.data.remote.model

data class CurrencyResponseEntry(
    val baseCurrency: String?, val rates: RatesEntry?
)
