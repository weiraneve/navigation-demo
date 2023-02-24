package com.weiran.navigation.ui.compose.viewmodel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.weiran.navigation.ui.compose.navigation.savedAnyRoute

sealed class SavedAction {
    data class UpdateUI(val navController: NavController): SavedAction()
}

class SavedViewModel: ViewModel() {

    private fun updateComposeUI(navController: NavController) {
        navController.navigate(savedAnyRoute)
    }

    fun dispatch(action: SavedAction) {
        when(action) {
            is SavedAction.UpdateUI -> updateComposeUI(action.navController)
        }
    }
}