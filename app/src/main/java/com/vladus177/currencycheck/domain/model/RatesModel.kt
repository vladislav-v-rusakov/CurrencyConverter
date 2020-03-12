package com.vladus177.currencycheck.domain.model

import com.vladus177.currencycheck.presentation.model.RateItem
import com.vladus177.currencycheck.presentation.model.Rates


data class RatesModel(
    val currencyCode: String?,
    val currencyName: String?,
    val currencyImageId: Int?,
    val rates: List<RatesItemModel>
)

fun RatesModel.fromDomainToUi(amount: Long) = Rates(
    currencyCode = currencyCode,
    currencyName = currencyName,
    currencyImageId = currencyImageId,
    amount = amount.toString(),
    rates = rates.map { it.fromDomainToUi(amount) }

)

fun RatesItemModel.fromDomainToUi(amount: Long) = RateItem(
    currencyCode = currencyCode,
    currencyName = currencyName,
    rate = rate,
    currencyImageId = currencyImageId,
    amount = amount
)
