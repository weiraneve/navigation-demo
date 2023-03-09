package com.weiran.navigation

import android.os.Bundle
import com.weiran.navigation.ui.compose.ComposeNavActivity
import com.weiran.navigation.ui.fragment.simple.SimpleNavActivity
import com.weiran.navigation.ui.fragment.simple_bottom_nav.SimpleBottomNavActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView()
        generateButtonAndUI(R.string.one_page_simple, SimpleNavActivity::class.java)
        generateButtonAndUI(R.string.home_simple_bottom_nav, SimpleBottomNavActivity::class.java)
        generateButtonAndUI(R.string.compose_nav, ComposeNavActivity::class.java)
    }
}