package com.vladus177.currencycheck.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.vladus177.currencycheck.common.Result
import com.vladus177.currencycheck.common.extensions.observe
import com.vladus177.currencycheck.databinding.FragmentCurrencyConverterBinding
import com.vladus177.currencycheck.domain.model.CurrencyResponseModel
import com.vladus177.currencycheck.presentation.CurrencyConverterViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class CurrencyConverterFragment : Fragment() {

    private val viewModel: CurrencyConverterViewModel by viewModel()
    private lateinit var viewDataBinding: FragmentCurrencyConverterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewDataBinding = FragmentCurrencyConverterBinding.inflate(inflater, container, false)
        return viewDataBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewDataBinding.lifecycleOwner = this.viewLifecycleOwner
        with(viewModel) {
            observe(currency, ::currencyObserver)
        }
    }

    private fun currencyObserver(result: Result<CurrencyResponseModel>?) {

    }
}