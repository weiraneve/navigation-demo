package com.weiran.navigation.ui.compose.page

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ForYouScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text("ForYou")
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            (0..100).forEach {
                item { 
                    Text(text = it.toString())
                }
            }
        }
    }
}