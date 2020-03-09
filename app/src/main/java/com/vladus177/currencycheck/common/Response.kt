package com.vladus177.currencycheck.common

data class Response<T>(
    val data: T,
    val status: Boolean,
    val message: String
)