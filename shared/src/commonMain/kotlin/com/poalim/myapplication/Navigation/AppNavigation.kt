package com.poalim.myapplication.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.kashif.voyant_common.Voyant
import com.poalim.myapplication.Screens.DetailsScreen
import com.poalim.myapplication.Screens.HomeScreen
import com.poalim.myapplication.Theme.AppTheme

@Composable
fun AppNavigation() {
    Voyant(content = {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = HomeScreen) {
            composable<HomeScreen> { backStackEntry ->
                val homeScreenModel = backStackEntry.toRoute<HomeScreen>()
                homeScreenModel.content(navController)
            }
            composable<DetailsScreen> { navBackStackEntry ->
                val detailsScreenModel =
                    navBackStackEntry.toRoute<DetailsScreen>()
                detailsScreenModel.content(navController)
            }
        }
    }, wrapper = { content ->
        AppTheme {
            content()
        }
    })
}