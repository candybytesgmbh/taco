package com.candybytes.taco.ui.util

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("goneUnless")
fun goneUnless(view: View?, visible: Boolean?) {
    view?.visibility = if (visible == true) View.VISIBLE else View.GONE
}
