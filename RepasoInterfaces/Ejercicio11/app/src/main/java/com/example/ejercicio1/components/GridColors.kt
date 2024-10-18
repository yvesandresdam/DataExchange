package com.example.ejercicio1.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SetColor1(widthValue: Int, heightValue: Int, colorValue: Color){
    Box(
        modifier = Modifier
            .background(colorValue)
            .width(widthValue.dp)
            .height(heightValue.dp)
    )
}

@Composable
fun SetColor2(colorValue: Color){
    Box(
        modifier = Modifier
            .background(colorValue)
            .width(50.dp)
            .height(50.dp)
    )
}