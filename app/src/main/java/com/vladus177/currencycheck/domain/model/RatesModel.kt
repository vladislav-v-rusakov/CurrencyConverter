package com.vladus177.currencycheck.domain.model

import com.vladus177.currencycheck.presentation.model.RateItem
import com.vladus177.currencycheck.presentation.model.Rates


data class RatesModel(
    val currencyCode: String?,
    val currencyName: String?,
    val rates: List<RatesItemModel>
)

fun RatesModel.fromDomainToUi() = Rates(
    currencyCode = currencyCode,
    currencyName = currencyName,
    rates = rates.map { it.fromDomainToUi() }

)

fun RatesItemModel.fromDomainToUi() = RateItem(
    currencyCode = currencyCode,
    currencyName = currencyName,
    rate = rate,
    currencyImageId = currencyImageId
)
