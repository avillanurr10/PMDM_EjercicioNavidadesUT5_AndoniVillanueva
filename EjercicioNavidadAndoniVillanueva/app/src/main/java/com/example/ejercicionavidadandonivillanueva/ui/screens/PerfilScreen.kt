package com.example.ejercicionavidadandonivillanueva.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PerfilScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Nombre: Andoni Villanueva")
        Spacer(modifier = Modifier.height(8.dp))
        Text("Email: andoni@gmail.com")
        Spacer(modifier = Modifier.height(8.dp))
        Text("Edad: 21")
    }
}
