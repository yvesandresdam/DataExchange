package com.example.ejercicio112bis.buttonsTest

import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.setValue


@Composable
fun Button1(name: String) {
    Text(
        text = name
    )
}

@Composable
fun Button2(name: String) {
    Text(
        text = name
    )
}

@Composable
fun Button3(name: String) {
    var text by remember { mutableStateOf("Input") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("label") }
    )
}