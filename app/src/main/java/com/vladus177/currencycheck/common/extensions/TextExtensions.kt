package com.vladus177.currencycheck.common.extensions

import android.text.Editable
import com.vladus177.currencycheck.data.DataConstant.AUD
import com.vladus177.currencycheck.data.DataConstant.BGN
import com.vladus177.currencycheck.data.DataConstant.BRL
import com.vladus177.currencycheck.data.DataConstant.CAD
import com.vladus177.currencycheck.data.DataConstant.CHF
import com.vladus177.currencycheck.data.DataConstant.CNY
import com.vladus177.currencycheck.data.DataConstant.CZK
import com.vladus177.currencycheck.data.DataConstant.DKK
import com.vladus177.currencycheck.data.DataConstant.EUR
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
        AUD -> "Australian Dollar"
        BGN -> "Bulgarian Lev"
        BRL -> "Brazilian Real"
        CAD -> "Canadian Dollar"
        CHF -> "Swiss Franc"
        CNY -> "Yuan Renminbi"
        CZK -> "Czech Koruna"
        DKK -> "Danish Krone"
        GBP -> "Pound Sterling"
        HKD -> "Hong Kong Dollar"
        HRK -> "Kuna"
        HUF -> "Forint"
        IDR -> "Rupiah"
        ILS -> "New Israeli Sheqel"
        INR -> "Indian Rupee"
        ISK -> "Iceland Krona"
        JPY -> "Yen"
        KRW -> "Won"
        MXN -> "Mexican Peso"
        MYR -> "Malaysian Ringgit"
        NOK -> "Norwegian Krone"
        NZD -> "New Zealand Dollar"
        PHP -> "Philippine Peso"
        PLN -> "Zloty"
        RON -> "Romanian Leu"
        RUB -> "Russian Ruble"
        SEK -> "Swedish Krona"
        SGD -> "Singapore Dollar"
        THB -> "Baht"
        USD -> "US Dollar"
        ZAR -> "Rand"
        EUR -> "Euro"
        else -> ""
    }
}

fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)

