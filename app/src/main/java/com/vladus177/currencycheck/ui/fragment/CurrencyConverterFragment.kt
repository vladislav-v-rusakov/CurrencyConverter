package com.vladus177.currencycheck.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vladus177.currencycheck.common.Result
import com.vladus177.currencycheck.common.extensions.observe
import com.vladus177.currencycheck.databinding.FragmentCurrencyConverterBinding
import com.vladus177.currencycheck.domain.model.RatesModel
import com.vladus177.currencycheck.domain.model.fromDomainToUi
import com.vladus177.currencycheck.presentation.CurrencyConverterViewModel
import com.vladus177.currencycheck.ui.view.CurrencyListView
import com.vladus177.currencycheck.ui.view.OnListItemClickListener
import org.koin.androidx.viewmodel.ext.android.viewModel

class CurrencyConverterFragment : Fragment(), OnListItemClickListener {

    private val viewModel: CurrencyConverterViewModel by viewModel()
    private lateinit var viewDataBinding: FragmentCurrencyConverterBinding
    private lateinit var listView: CurrencyListView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = FragmentCurrencyConverterBinding.inflate(inflater, container, false)
        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewDataBinding.lifecycleOwner = this
        listView = viewDataBinding.currenciesList
        with(viewModel) { observe(currency, ::currencyObserver) }
        viewModel.getCurrency("EUR")
    }

    private fun currencyObserver(result: Result<RatesModel>?) {
        when (result) {
            is Result.OnLoading -> {
            }
            is Result.OnSuccess -> {
                listView.setData(result.value.fromDomainToUi(), this)
            }
            is Result.OnError -> {
            }
            is Result.OnCancel -> {
            }
            else -> {
            }
        }
    }

    override fun onClickItem(currencyCode: String) {
        viewModel.getCurrency(currencyCode)
    }
}