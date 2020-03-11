package com.vladus177.currencycheck.common.extensions

import com.vladus177.currencycheck.data.DataConstant

fun getCurrencyDrawableFromCode(code: String?): Int {
    return when (code) {
        DataConstant.AUD -> 1
        DataConstant.BGN -> 1
        DataConstant.BRL -> 1
        DataConstant.CAD -> 1
        DataConstant.CHF -> 1
        DataConstant.CNY -> 1
        DataConstant.CZK -> 1
        DataConstant.DKK -> 1
        DataConstant.GBP -> 1
        DataConstant.HKD -> 1
        DataConstant.HRK -> 1
        DataConstant.HUF -> 1
        DataConstant.IDR -> 1
        DataConstant.ILS -> 1
        DataConstant.INR -> 1
        DataConstant.ISK -> 1
        DataConstant.JPY -> 1
        DataConstant.KRW -> 1
        DataConstant.MXN -> 1
        DataConstant.MYR -> 1
        DataConstant.NOK -> 1
        DataConstant.NZD -> 1
        DataConstant.PHP -> 1
        DataConstant.PLN -> 1
        DataConstant.RON -> 1
        DataConstant.RUB -> 1
        DataConstant.SEK -> 1
        DataConstant.SGD -> 1
        DataConstant.THB -> 1
        DataConstant.USD -> 1
        DataConstant.ZAR -> 1
        else -> 0
    }
}