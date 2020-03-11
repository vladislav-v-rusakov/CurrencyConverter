package com.vladus177.currencycheck.presentation.model

data class Rates(
    val currencyCode: String?,
    val currencyName: String?,
    val currencyImageId: Int?,
    val rates: List<RateItem>
)