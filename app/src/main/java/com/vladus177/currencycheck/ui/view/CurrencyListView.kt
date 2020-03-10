package com.vladus177.currencycheck.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.vladus177.currencycheck.databinding.ViewCurrencyListBinding

class CurrencyListView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0) : LinearLayout(context, attrs, defStyleAttr)  {


    private val binding: ViewCurrencyListBinding = ViewCurrencyListBinding.inflate(LayoutInflater.from(context), this, true)


    fun setData() {
        binding.apply {
            executePendingBindings()
        }
    }

    fun setClickListenerForBtn(clickListener: () -> Unit) {
        //binding.btnFinish.setOnClickListener { clickListener() }
    }
}