package com.example.ejercicionavidadandonivillanueva.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.ejercicionavidadandonivillanueva.ui.viewmodel.CharacterViewModel
import com.example.ejercicionavidadandonivillanueva.ui.data.model.Character

@Composable
fun ListadoScreen(viewModel: CharacterViewModel = viewModel()) {

    val characters by viewModel.characters.collectAsState()

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        items(characters) { character ->
            CharacterCard(character)
        }
    }
}

@Composable
fun CharacterCard(character: Character) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(8.dp)
        ) {
            AsyncImage(
                model = character.image,
                contentDescription = character.name,
                modifier = Modifier.size(80.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(character.name, style = MaterialTheme.typography.titleMedium)
                Text("Estado: ${character.status}")
                Text("Especie: ${character.species}")
            }
        }
    }
}
