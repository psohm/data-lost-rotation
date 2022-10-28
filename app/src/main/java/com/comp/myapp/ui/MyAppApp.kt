package com.comp.myapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.comp.myapp.ui.components.ProductEditView
import com.comp.myapp.viewmodel.ProductEditViewModel

@Composable
fun MyAppApp(
    appState:  MyAppAppState = rememberAppState()
) {
        NavHost(
            navController = appState.navController,
            startDestination = Screen.ProductAddPath.route
            )
        {
            composable(Screen.ProductAddPath.route) {
                ProductEditView(
                    vm = ProductEditViewModel ()
                )
            }
        }
}
