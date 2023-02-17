package com.weiran.navigation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.weiran.navigation.ui.compose.Home

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startXmlNavigationUi()
        startComposeNavigationUi()
    }

    private fun startComposeNavigationUi() {
        setContent {
            Home()
        }
    }

    private fun startXmlNavigationUi() {
        setContentView(R.layout.activity_main)
    }
}