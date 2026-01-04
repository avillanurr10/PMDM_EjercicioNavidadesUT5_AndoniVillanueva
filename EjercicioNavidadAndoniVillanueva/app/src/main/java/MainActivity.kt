package com.example.ejercicionavidadandonivillanueva

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.ejercicionavidadandonivillanueva.ui.components.BottomBar
import com.example.ejercicionavidadandonivillanueva.ui.navigation.AppNavigation
import com.example.ejercicionavidadandonivillanueva.ui.theme.EjercicioNavidadAndoniVillanuevaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EjercicioNavidadAndoniVillanuevaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    val navController = rememberNavController()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("Ejercicio Navidad") }
            )
        },
        bottomBar = {
            BottomBar(navController)
        }
    ) { paddingValues ->
        AppNavigation(
            navController = navController,
            paddingValues = paddingValues
        )
    }
}
