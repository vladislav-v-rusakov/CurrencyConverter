package com.vladus177.currencycheck.common

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

object BindingAdapters {

    @BindingAdapter(value = ["entriesList", "listItemLayout"], requireAll = true)
    @JvmStatic
    fun <T> setEntriesList(viewGroup: ViewGroup,
                           entries: List<T>?, layoutId: Int) {
        viewGroup.removeAllViews()
        val inflater = viewGroup.context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        entries?.indices?.let { indices ->
            for (i in indices) {
                val entry = entries[i]
                val binding: ViewDataBinding = DataBindingUtil
                    .inflate(inflater, layoutId, viewGroup, true)
                //binding.setVariable(BR.data, entry)
            }
        }
    }
}