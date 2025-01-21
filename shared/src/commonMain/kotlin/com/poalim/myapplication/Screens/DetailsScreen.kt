package com.poalim.myapplication.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.kashif.voyant_navigation_compose.VoyantRoute
import com.kashif.voyant_navigation_compose.popBackStackX
import kotlinx.serialization.Serializable

@Serializable
object DetailsScreen: VoyantRoute {
    @Composable
    override fun content(navController: NavController) {
        Scaffold(
            content = {
                Column(Modifier.padding(20.dp)) {
                    Spacer(Modifier.height(50.dp))
                    Text("Details Screen")
                    Button(onClick = {
                        navController.popBackStackX()
                    }) {
                        Text("Back")
                    }
                }
            }
        )
    }
}