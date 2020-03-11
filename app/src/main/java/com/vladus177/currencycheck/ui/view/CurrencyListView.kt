package com.vladus177.currencycheck.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.vladus177.currencycheck.R
import com.vladus177.currencycheck.databinding.ViewCurrencyListBinding
import com.vladus177.currencycheck.presentation.model.Rates

class CurrencyListView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private var binding: ViewCurrencyListBinding? = null

    init {
        binding = ViewCurrencyListBinding.inflate(
            LayoutInflater.from(context), this, true
        )
        binding?.layoutId = DEFAULT_ITEM_ID
    }


    fun setData(rates: Rates, clickListener: OnListItemClickListener) {
        binding?.apply {
            binding?.currencies = rates
            executePendingBindings()
        }
    }

    companion object {
        const val DEFAULT_ITEM_ID = R.layout.currency_list_item
    }
}