package com.vladus177.currencycheck.data

import com.vladus177.currencycheck.common.extensions.getCurrencyDrawableFromCode
import com.vladus177.currencycheck.common.extensions.getCurrencyNameFromCode
import com.vladus177.currencycheck.data.remote.model.CurrencyResponseEntry
import com.vladus177.currencycheck.domain.model.RatesItemModel
import com.vladus177.currencycheck.domain.model.RatesModel

class CurrencyDataMapper {

    fun CurrencyResponseEntry.fromDataToDomain() = RatesModel(
        currencyCode = baseCurrency,
        currencyName = getCurrencyNameFromCode(baseCurrency),
        rates = ratesEntryItemToRatesModelItem(rates)
    )

    private fun ratesEntryItemToRatesModelItem(map: Map<String, Double>?): List<RatesItemModel> {
        val list = mutableListOf<RatesItemModel>()
        if (map != null) {
            for ((key, value) in map) {
                list.add(
                    RatesItemModel(
                        key,
                        getCurrencyNameFromCode(key),
                        value,
                        getCurrencyDrawableFromCode(key)
                    )
                )
            }
        }
        return list
    }
}