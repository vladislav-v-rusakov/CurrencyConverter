package com.vladus177.currencycheck.presentation.model

data class RateItem(
    val currencyCode: String?,
    val currencyName: String?,
    val rate: Number?,
    val currencyImageId: Int?
)