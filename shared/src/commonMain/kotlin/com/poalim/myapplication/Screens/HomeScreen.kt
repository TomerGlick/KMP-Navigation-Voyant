package com.poalim.myapplication.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kashif.voyant_navigation_compose.VoyantRoute
import com.kashif.voyant_navigation_compose.navigateX
import kotlinx.coroutines.sync.Mutex
import kotlinx.serialization.Serializable

@Serializable
object HomeScreen: VoyantRoute {
    @Composable
    override fun content(navController: NavController) {
        Scaffold(
            content = {
                Column(Modifier.padding(20.dp)) {
                    Spacer(Modifier.height(50.dp))
                    Text("Home Screen")
                    Button(onClick = {
                        navController.navigateX(DetailsScreen)
                    }) {
                        Text("Go to Details")
                    }
                }
            }
        )
    }
}
