package com.weiran.navigation.ui.custom

import androidx.annotation.IdRes
import androidx.navigation.NavController

class Navigator constructor(private val navController: NavController) {


    // todo three params
    fun navigate(@IdRes resId: Int) {
        navController.navigate(resId)
    }

    // todo config anim



}