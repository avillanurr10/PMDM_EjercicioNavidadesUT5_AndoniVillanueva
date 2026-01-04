package com.example.ejercicionavidadandonivillanueva.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BottomBar(navController: NavController) {

    NavigationBar {

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("perfil") },
            icon = { Icon(Icons.Default.Person, contentDescription = "Perfil") },
            label = { Text("Perfil") }
        )

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("listado") },
            icon = { Icon(Icons.Default.List, contentDescription = "Listado") },
            label = { Text("Listado") }
        )

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("favoritos") },
            icon = { Icon(Icons.Default.Favorite, contentDescription = "Favoritos") },
            label = { Text("Favoritos") }
        )

        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate("config") },
            icon = { Icon(Icons.Default.Settings, contentDescription = "Configuración") },
            label = { Text("Config") }
        )
    }
}
