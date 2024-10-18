package com.example.ejercicio1.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun buttonText() {
    Text(
        text = "texto de ejemplo"
    )
}

@Composable
fun iconText() {
    Text(
        text = "Icono Nombre"
    )
    Icon(
        imageVector = Icons.Outlined.AccountCircle,
        contentDescription = "text",
        //modifier = Modifier.padding(10.dp),
        tint = Color.Red
    )
}

