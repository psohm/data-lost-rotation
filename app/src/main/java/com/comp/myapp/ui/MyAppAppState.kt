
package com.comp.myapp.ui

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

/**
 * List of screens for [MyAppApp]
 */
sealed class Screen(val route: String) {
    object ProductAddPath : Screen("ProductAdd")
}

@Composable
fun rememberAppState(
    navController: NavHostController = rememberNavController(),
    context: Context = LocalContext.current
) = remember(navController, context) {
    MyAppAppState(navController, context)
}

class MyAppAppState(
    val navController: NavHostController,
    val context: Context
)