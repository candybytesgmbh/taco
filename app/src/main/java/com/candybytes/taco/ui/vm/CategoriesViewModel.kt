package com.candybytes.taco.ui.vm

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.map
import com.candybytes.taco.api.TacoService
import timber.log.Timber

class CategoriesViewModel @ViewModelInject constructor(
    private val tacoService: TacoService,
    @Assisted private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    val totalTacoCategories = liveData {
        try {
            emit(tacoService.getAllCategoriesAsync())
        } catch (e: Exception) {
            Timber.e(e)
        }
    }.map { "Loaded ${it.size} categories\nImplement a list view and show all category elements." }


}
