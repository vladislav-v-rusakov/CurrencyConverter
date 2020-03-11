package com.vladus177.currencycheck.presentation.model

data class Rates(
    val currencyCode: String?,
    val currencyName: String?,
    val rates: List<RateItem>
)