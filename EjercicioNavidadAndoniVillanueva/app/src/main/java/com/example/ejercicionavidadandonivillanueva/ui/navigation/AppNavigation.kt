package com.example.ejercicionavidadandonivillanueva.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ejercicionavidadandonivillanueva.ui.screens.*

@Composable
fun AppNavigation(
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = "listado",
        modifier = Modifier.padding(paddingValues)
    ) {
        composable("perfil") { PerfilScreen() }
        composable("listado") { ListadoScreen() }
        composable("favoritos") { FavoritosScreen() }
        composable("config") { ConfigScreen() }
    }
}
