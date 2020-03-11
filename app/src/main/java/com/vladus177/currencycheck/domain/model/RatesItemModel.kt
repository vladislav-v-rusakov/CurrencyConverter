package com.vladus177.currencycheck.domain.model

data class RatesItemModel(
    val currencyCode: String?,
    val currencyName: String?,
    val rate: Number?,
    val currencyImageId: Int?
)