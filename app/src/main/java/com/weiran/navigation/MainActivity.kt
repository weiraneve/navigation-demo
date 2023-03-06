package com.weiran.navigation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.weiran.navigation.ui.compose.ComposeNavActivity
import com.weiran.navigation.ui.fragment.simple.SimpleNavActivity
import com.weiran.navigation.ui.fragment.simple_bottom_nav.SimpleBottomNavActivity

class MainActivity : AppCompatActivity() {

    private val buttonContainer: LinearLayout by lazy { findViewById(R.id.button_container) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startXmlNavigationUi()
    }

    private fun startXmlNavigationUi() {
        setContentView(R.layout.activity_main)
        generateButtonAndUI(R.string.home_simple_nav, SimpleNavActivity::class.java)
        generateButtonAndUI(R.string.home_simple_bottom_nav, SimpleBottomNavActivity::class.java)
        generateButtonAndUI(R.string.compose_nav, ComposeNavActivity::class.java)
    }

    private fun <T : AppCompatActivity> generateButtonAndUI(layoutInt: Int, java: Class<T>) {
        addButton(getString(layoutInt)) {
            startActivity(Intent(this, java))
        }
    }

    private fun addButton(name: String, onClickListener: View.OnClickListener? = null) {
        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        layoutParams.setMargins(0, resources.getDimensionPixelSize(R.dimen.dimen_24), 0, 0)
        val button = Button(this)
        button.layoutParams = layoutParams
        button.text = name
        button.isAllCaps = false
        onClickListener?.let {
            button.setOnClickListener(it)
        }
        buttonContainer.addView(button)
    }
}