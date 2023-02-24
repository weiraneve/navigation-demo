package com.weiran.navigation.ui.compose

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumedWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.weiran.navigation.ui.compose.navigation.MyNavigationBar
import com.weiran.navigation.ui.compose.navigation.TopLevelDestination
import com.weiran.navigation.ui.compose.navigation.fouYouRoute
import com.weiran.navigation.ui.compose.navigation.forYouScreen
import com.weiran.navigation.ui.compose.navigation.interestScreen
import com.weiran.navigation.ui.compose.navigation.navigateToTopLevelDestination
import com.weiran.navigation.ui.compose.navigation.savedAnyScreen
import com.weiran.navigation.ui.compose.navigation.savedScreen

@OptIn(ExperimentalLayoutApi::class, ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.values().asList()
    val navController = rememberNavController()
    val currentDestination: NavDestination? =
        navController.currentBackStackEntryAsState().value?.destination

    Scaffold(bottomBar = {
        MyNavigationBar(
            destinations = topLevelDestinations,
            navController = navController,
            onNavigateToDestination = { destinations, NavController ->
                navigateToTopLevelDestination(destinations, NavController)
            },
            currentDestination = currentDestination
        )

    }) { padding ->

        NavHost(
            navController = navController,
            startDestination = fouYouRoute,
            modifier = Modifier
                .padding(padding)
                .consumedWindowInsets(padding)
        ) {
            forYouScreen()
            savedScreen(navController)
            savedAnyScreen()
            interestScreen()
        }
    }
}