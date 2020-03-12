package com.vladus177.currencycheck.common.extensions

import com.vladus177.currencycheck.R
import com.vladus177.currencycheck.data.DataConstant

fun getCurrencyDrawableFromCode(code: String?): Int {
    return when (code) {
        DataConstant.AUD -> R.drawable.ic_australia
        DataConstant.BGN -> R.drawable.ic_bulgaria
        DataConstant.BRL -> R.drawable.ic_brazil
        DataConstant.CAD -> R.drawable.ic_canada
        DataConstant.CHF -> R.drawable.ic_swiss
        DataConstant.CNY -> R.drawable.ic_china
        DataConstant.CZK -> R.drawable.ic_czech
        DataConstant.DKK -> R.drawable.ic_denmark
        DataConstant.GBP -> R.drawable.ic_great_britain
        DataConstant.HKD -> R.drawable.ic_hong_kong
        DataConstant.HRK -> R.drawable.ic_croatia
        DataConstant.HUF -> R.drawable.ic_hungary
        DataConstant.IDR -> R.drawable.ic_indonesia
        DataConstant.ILS -> R.drawable.ic_israel
        DataConstant.INR -> R.drawable.ic_india
        DataConstant.ISK -> R.drawable.ic_iceland
        DataConstant.JPY -> R.drawable.ic_japan
        DataConstant.KRW -> R.drawable.ic_korea
        DataConstant.MXN -> R.drawable.ic_mexico
        DataConstant.MYR -> R.drawable.ic_malaysia
        DataConstant.NOK -> R.drawable.ic_norway
        DataConstant.NZD -> R.drawable.ic_new_zealand
        DataConstant.PHP -> R.drawable.ic_phillipinnes
        DataConstant.PLN -> R.drawable.ic_poland
        DataConstant.RON -> R.drawable.ic_romania
        DataConstant.RUB -> R.drawable.ic_russia
        DataConstant.SEK -> R.drawable.ic_sweden
        DataConstant.SGD -> R.drawable.ic_singapoure
        DataConstant.THB -> R.drawable.ic_thai
        DataConstant.USD -> R.drawable.ic_usa
        DataConstant.ZAR -> R.drawable.ic_central_africa
        DataConstant.EUR -> R.drawable.ic_euro
        else -> 0
    }
}