package com.candybytes.taco.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.candybytes.taco.databinding.FragmentSearchFoodBinding
import com.candybytes.taco.ui.vm.SearchFoodViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFoodFragment : Fragment() {

    private val viewModel: SearchFoodViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return FragmentSearchFoodBinding.inflate(layoutInflater, container, false).apply {
            viewModel = this@SearchFoodFragment.viewModel
            lifecycleOwner = this@SearchFoodFragment
        }.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}
