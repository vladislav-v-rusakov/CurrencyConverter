package com.vladus177.currencycheck

import android.app.Application
import com.vladus177.currencycheck.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

const val URL_BASE_CURRENCY_API = "https://hiring.revolut.codes/api/android"

class CurrencyCheckApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@CurrencyCheckApp)
            modules(listOf(appModule))
        }
    }
}