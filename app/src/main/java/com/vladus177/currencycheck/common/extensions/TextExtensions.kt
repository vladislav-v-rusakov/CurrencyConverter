package com.vladus177.currencycheck.common.extensions

import com.vladus177.currencycheck.data.DataConstant.AUD
import com.vladus177.currencycheck.data.DataConstant.BGN
import com.vladus177.currencycheck.data.DataConstant.BRL
import com.vladus177.currencycheck.data.DataConstant.CAD
import com.vladus177.currencycheck.data.DataConstant.CHF
import com.vladus177.currencycheck.data.DataConstant.CNY
import com.vladus177.currencycheck.data.DataConstant.CZK
import com.vladus177.currencycheck.data.DataConstant.DKK
import com.vladus177.currencycheck.data.DataConstant.GBP
import com.vladus177.currencycheck.data.DataConstant.HKD
import com.vladus177.currencycheck.data.DataConstant.HRK
import com.vladus177.currencycheck.data.DataConstant.HUF
import com.vladus177.currencycheck.data.DataConstant.IDR
import com.vladus177.currencycheck.data.DataConstant.ILS
import com.vladus177.currencycheck.data.DataConstant.INR
import com.vladus177.currencycheck.data.DataConstant.ISK
import com.vladus177.currencycheck.data.DataConstant.JPY
import com.vladus177.currencycheck.data.DataConstant.KRW
import com.vladus177.currencycheck.data.DataConstant.MXN
import com.vladus177.currencycheck.data.DataConstant.MYR
import com.vladus177.currencycheck.data.DataConstant.NOK
import com.vladus177.currencycheck.data.DataConstant.NZD
import com.vladus177.currencycheck.data.DataConstant.PHP
import com.vladus177.currencycheck.data.DataConstant.PLN
import com.vladus177.currencycheck.data.DataConstant.RON
import com.vladus177.currencycheck.data.DataConstant.RUB
import com.vladus177.currencycheck.data.DataConstant.SEK
import com.vladus177.currencycheck.data.DataConstant.SGD
import com.vladus177.currencycheck.data.DataConstant.THB
import com.vladus177.currencycheck.data.DataConstant.USD
import com.vladus177.currencycheck.data.DataConstant.ZAR

fun getCurrencyNameFromCode(code: String?): String {
    return when (code) {
        AUD -> ""
        BGN -> ""
        BRL -> ""
        CAD -> "Canadian dollar"
        CHF -> ""
        CNY -> ""
        CZK -> ""
        DKK -> ""
        GBP -> ""
        HKD -> ""
        HRK -> ""
        HUF -> ""
        IDR -> ""
        ILS -> ""
        INR -> ""
        ISK -> ""
        JPY -> ""
        KRW -> ""
        MXN -> ""
        MYR -> ""
        NOK -> ""
        NZD -> ""
        PHP -> ""
        PLN -> ""
        RON -> ""
        RUB -> "Russian rouble"
        SEK -> ""
        SGD -> ""
        THB -> ""
        USD -> "US dollar"
        ZAR -> ""
        else -> ""
    }
}

