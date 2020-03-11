package com.vladus177.currencycheck.ui.view

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.TableRow
import androidx.databinding.ObservableBoolean
import com.vladus177.currencycheck.databinding.CurrencyListItemBinding

class CurrencyItem constructor(context: Context, attrs: AttributeSet) : TableRow(context, attrs) {

    private var binding: CurrencyListItemBinding? = null

    init {
        binding = CurrencyListItemBinding.inflate(
            LayoutInflater.from(context), this, true)
        /*val padding: Int = dpAsPixels(8, this)
        this.setPadding(0, padding, 0, padding)
        this.gravity = Gravity.CENTER_VERTICAL*/
    }

   /* fun setAttrs(title: String?, description: String?, showTooltip: ObservableBoolean?) {
        binding?.apply {
            tableRowTitle = title
            tableRowDescription = description
        }
    }*/

    companion object{
        const val DEFAULT_AMOUNT = 100
    }
}