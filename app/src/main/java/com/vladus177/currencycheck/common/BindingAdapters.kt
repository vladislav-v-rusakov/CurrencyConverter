package com.vladus177.currencycheck.common

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.vladus177.currencycheck.BR
import com.vladus177.currencycheck.presentation.model.RateItem
import com.vladus177.currencycheck.ui.view.OnListItemClickListener
import android.graphics.drawable.Drawable
import android.widget.TextView
import java.math.BigDecimal
import java.math.RoundingMode


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
                binding.root.setOnClickListener {
                    if (entry is RateItem) {
                        clickListener.onClickItem(entry.currencyCode)
                    }
                }
                binding.setVariable(BR.data, entry)
            }
        }
    }

    @JvmStatic
    @BindingAdapter("android:src")
    fun setImageResource(imageView: ImageView, resource: Int) {
        imageView.clipToOutline = true
        imageView.setImageResource(resource)
    }

    @JvmStatic
    @BindingAdapter("android:src")
    fun setImageDrawable(view: ImageView, drawable: Drawable) {
        view.clipToOutline = true
        view.setImageDrawable(drawable)
    }

    @JvmStatic
    @BindingAdapter("roundDecimals")
    fun roundDecimals(view: TextView, value: Double) {
        var result: String = "0.0"
        runCatching {
            result = BigDecimal(value).setScale(2, RoundingMode.HALF_EVEN).toString()
        }.onSuccess {
            view.text = result
        }.onFailure {
            view.text = result
        }
    }
}
