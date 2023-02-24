package com.weiran.navigation.ui.compose

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumedWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.weiran.navigation.ui.compose.navigation.MyNavigationBar
import com.weiran.navigation.ui.compose.navigation.TopLevelDestination
import com.weiran.navigation.ui.compose.navigation.forYouScreen
import com.weiran.navigation.ui.compose.navigation.fouYouRoute
import com.weiran.navigation.ui.compose.navigation.interestScreen
import com.weiran.navigation.ui.compose.navigation.navigateToTopLevelDestination
import com.weiran.navigation.ui.compose.navigation.savedAnyScreen
import com.weiran.navigation.ui.compose.navigation.savedScreen

@OptIn(
    ExperimentalLayoutApi::class, ExperimentalMaterial3Api::class,
    ExperimentalAnimationApi::class
)
@Composable
fun Home() {
    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.values().asList()
    val navController = rememberAnimatedNavController()
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

        AnimatedNavHost(
            navController = navController,
            startDestination = fouYouRoute,
            modifier = Modifier
                .padding(padding)
                .consumedWindowInsets(padding),
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentScope.SlideDirection.Left,
                    animationSpec = tween(350)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentScope.SlideDirection.Left,
                    animationSpec = tween(350)
                )
            },
            popEnterTransition = {
                slideIntoContainer(
                    AnimatedContentScope.SlideDirection.Right,
                    animationSpec = tween(350)
                )
            },
            popExitTransition = {
                slideOutOfContainer(
                    AnimatedContentScope.SlideDirection.Right,
                    animationSpec = tween(350)
                )
            }
        ) {
            forYouScreen()
            savedScreen(navController)
            savedAnyScreen()
            interestScreen()
        }
    }
}