package com.weiran.navigation.ui.fragment.simple_bottom_nav.formscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.weiran.navigation.R
import com.weiran.navigation.ui.custom.Navigator
import com.weiran.navigation.ui.fragment.simple_bottom_nav.listscreen.ListViewModel

class Register : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_simple_nav_register, container, false)
//        view.findViewById<Button>(R.id.simple_nav_signup_btn).setOnClickListener {
//            findNavController().navigate(R.id.action_register_to_registered)
//        }
        view.findViewById<Button>(R.id.simple_nav_signup_btn).setOnClickListener {
            val viewModel = ListViewModel()
            val navController = findNavController()
            val navigator = Navigator(navController)
            viewModel.clickAction(navigator)
        }
        return view
    }
}
