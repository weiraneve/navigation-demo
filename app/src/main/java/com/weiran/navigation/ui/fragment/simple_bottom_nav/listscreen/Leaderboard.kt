package com.weiran.navigation.ui.fragment.simple_bottom_nav.listscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.weiran.navigation.R

/**
 * Shows a static leaderboard with multiple users.
 */
class Leaderboard : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple_nav_leaderboard, container, false)
    }

}