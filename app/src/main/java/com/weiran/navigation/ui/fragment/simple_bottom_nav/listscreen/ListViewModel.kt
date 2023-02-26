package com.weiran.navigation.ui.fragment.simple_bottom_nav.listscreen

import androidx.lifecycle.ViewModel
import com.weiran.navigation.R
import com.weiran.navigation.ui.custom.Navigator

class ListViewModel: ViewModel() {

    fun clickAction(navigator: Navigator) {
        navigator.navigate(R.id.registered)
    }
}