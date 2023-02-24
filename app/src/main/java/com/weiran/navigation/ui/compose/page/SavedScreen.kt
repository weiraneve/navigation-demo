package com.weiran.navigation.ui.compose.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.weiran.navigation.ui.compose.viewmodel.SavedAction
import com.weiran.navigation.ui.compose.viewmodel.SavedViewModel

@Composable
fun SavedScreen(navController: NavController) {
    Column {
        Text(text = "Saved")
        Spacer(modifier = Modifier.height(100.dp))
        val viewModel: SavedViewModel = viewModel()
        Button(onClick = { viewModel::dispatch.invoke(SavedAction.UpdateUI(navController)) }) { Text("跳转 saveAny界面") }
//        Button(onClick = { navController.navigate(savedAnyRoute) }) { Text("跳转 saveAny界面") }
    }
}