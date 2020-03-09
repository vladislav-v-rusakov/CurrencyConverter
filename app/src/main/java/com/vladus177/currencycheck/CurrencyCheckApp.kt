package com.vladus177.currencycheck

import android.app.Application

class CurrencyCheckApp : Application()
{
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        /*startKoin {
            androidContext(this@UExperienceApp)
            modules(listOf(appModule))
        }*/
    }
}