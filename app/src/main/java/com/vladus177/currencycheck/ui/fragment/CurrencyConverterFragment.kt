package com.vladus177.currencycheck.ui.fragment

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
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

class CurrencyConverterFragment : Fragment(), OnListItemClickListener, TextWatcher {

    private val viewModel: CurrencyConverterViewModel by viewModel()
    private lateinit var viewDataBinding: FragmentCurrencyConverterBinding
    private lateinit var listView: CurrencyListView
    private var amount: Long = DEFAULT_AMOUNT
    private var currency: String? = DEFAULT_CURRENCY

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = FragmentCurrencyConverterBinding.inflate(inflater, container, false)
        viewDataBinding.loading = false
        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewDataBinding.lifecycleOwner = this
        listView = viewDataBinding.currenciesList
        listView.setListeners(this, this)
        with(viewModel) { observe(currency, ::currencyObserver) }
        viewModel.getCurrency(currency, true)
    }

    private fun currencyObserver(result: Result<RatesModel>?) {
        when (result) {
            is Result.OnLoading -> { }
            is Result.OnSuccess -> {
                viewDataBinding.loading = false
                listView.setData(result.value.fromDomainToUi(amount))
            }
            is Result.OnError -> { }
            is Result.OnCancel -> { }
        }
    }

    override fun onClickItem(currencyCode: String?) {
        currency = currencyCode
        viewModel.getCurrency(currency, true)
    }

    override fun afterTextChanged(textInput: Editable?) {
        if (textInput.isNullOrEmpty()) amount = DEFAULT_AMOUNT else {
            amount = textInput.toString().toLong()
            viewModel.getCurrency(currency, true)
        }
    }

    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

    companion object {
        const val DEFAULT_CURRENCY: String = "EUR"
        const val DEFAULT_AMOUNT: Long = 1
    }
}