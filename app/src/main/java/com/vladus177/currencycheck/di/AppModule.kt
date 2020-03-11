package com.vladus177.currencycheck.di

import android.content.Context
import android.net.ConnectivityManager
import com.vladus177.currencycheck.BuildConfig
import com.vladus177.currencycheck.data.CurrencyDataMapper
import com.vladus177.currencycheck.data.local.source.CurrencyLocalDataSource
import com.vladus177.currencycheck.data.remote.net.CurrencyApi
import com.vladus177.currencycheck.data.remote.source.CurrencyRemoteDataSource
import com.vladus177.currencycheck.data.repository.CurrencyRepository
import com.vladus177.currencycheck.domain.GetCurrencyUseCase
import com.vladus177.currencycheck.presentation.CurrencyConverterViewModel
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

val appModule = module {

    single {
        androidContext().getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    //Android Services
    val login = HttpLoggingInterceptor()
    login.level = HttpLoggingInterceptor.Level.BODY

    //Retrofit
    single {
        OkHttpClient.Builder()
            .callTimeout(1, TimeUnit.MINUTES)
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(1, TimeUnit.MINUTES)
            .writeTimeout(1, TimeUnit.MINUTES)
            .retryOnConnectionFailure(true)
            .connectionPool(ConnectionPool(0, 1, TimeUnit.NANOSECONDS))
            .addInterceptor(login)
            .build()
    }
    single {
        Retrofit.Builder()
            .baseUrl(BuildConfig.API_URL)
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    single { get<Retrofit>().create(CurrencyApi::class.java) as CurrencyApi }


    //DataSource
    factory { CurrencyLocalDataSource() }
    factory { CurrencyRemoteDataSource(get()) }


    // Repositories
    factory { CurrencyRepository(get(), get(), get()) }


    // View models
    viewModel { CurrencyConverterViewModel(get()) }


    // UseCases
    factory { GetCurrencyUseCase(get()) }

    // Mappers
    factory {CurrencyDataMapper()}


}