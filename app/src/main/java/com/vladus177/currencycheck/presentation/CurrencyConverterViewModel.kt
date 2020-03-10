package com.vladus177.currencycheck.presentation

import androidx.lifecycle.ViewModel
import com.vladus177.currencycheck.common.extensions.LiveResult
import com.vladus177.currencycheck.domain.GetCurrencyUseCase
import com.vladus177.currencycheck.domain.model.CurrencyRequestParam
import com.vladus177.currencycheck.domain.model.CurrencyResponseModel

class CurrencyConverterViewModel(private val getCurrencyUseCase: GetCurrencyUseCase) : ViewModel() {

    val currency = LiveResult<CurrencyResponseModel>()

    fun getCurrency() {
        getCurrencyUseCase.execute(
            liveData = currency,
            params = CurrencyRequestParam("USD")
        )
    }
}