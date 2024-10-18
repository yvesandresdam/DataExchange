package com.example.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicio1.components.SetColor1
import com.example.ejercicio1.components.SetColor2
import com.example.ejercicio1.components.buttonText
import com.example.ejercicio1.components.iconText
import com.example.ejercicio1.ui.theme.Ejercicio1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Column(
//                        modifier = Modifier
//                            .padding(innerPadding)
//                            .padding(50.dp)
//                    ) {
//                        buttonText()
//                        iconText()
//                    }
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                    ) {
                        Box(
                            modifier = Modifier

                                .fillMaxWidth()
                        ) {
                            SetColor1(50, 50, Color(255, 0, 0))
                        }
                        Box(
                            modifier = Modifier

                                .fillMaxWidth()
                        ) {
                            SetColor2(Color(0, 0, 255))
                        }
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp)
                                .background(Color(0,255,0))
                        )
                    }
                }
            }
        }
    }
}

