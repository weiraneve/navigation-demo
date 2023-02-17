package com.weiran.navigation.ui.compose.page

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.weiran.navigation.ui.compose.navigation.savedAnyRoute

@Composable
fun SavedScreen(navController: NavHostController) {
    Column {
        Text(text = "Saved")
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = { navController.navigate(savedAnyRoute) }) { Text("跳转 saveAny界面") }
    }
}