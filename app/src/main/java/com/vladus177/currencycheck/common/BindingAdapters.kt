package com.vladus177.currencycheck.common

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.vladus177.currencycheck.BR
import com.vladus177.currencycheck.ui.view.OnListItemClickListener

object BindingAdapters {

    @BindingAdapter(
        value = ["entriesList", "listItemLayout", "itemClickListener"],
        requireAll = true
    )
    @JvmStatic
    fun <T> setEntriesList(
        viewGroup: ViewGroup,
        entries: List<T>?, layoutId: Int, clickListener: OnListItemClickListener
    ) {
        viewGroup.removeAllViews()
        val inflater = viewGroup.context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        entries?.indices?.let { indices ->
            for (i in indices) {
                val entry = entries[i]
                val binding: ViewDataBinding = DataBindingUtil
                    .inflate(inflater, layoutId, viewGroup, true)
                binding.root.setOnClickListener { clickListener }
                binding.setVariable(BR.data, entry)
            }
        }
    }
}