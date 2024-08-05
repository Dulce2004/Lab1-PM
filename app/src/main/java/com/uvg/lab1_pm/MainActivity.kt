package com.uvg.lab1_pm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uvg.lab1_pm.ui.theme.Lab1PMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1PMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        message1 = "Dulce Ambrosio",
                        message2 = "Plataformas Móviles",
                        message3 = "Laboratorio 1",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(message1: String, message2: String, message3: String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxSize().padding(8.dp)
    ){
        Column (
            verticalArrangement = Arrangement.Center,
            modifier = modifier.padding(8.dp)){
            Text(
                text = message1,
                fontSize = 30.sp,
                lineHeight = 50.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = message2,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = message3,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab1PMTheme {
        Greeting("Dulce Ambrosio", message2 = "Plataformas Móviles", message3 = "Laboratorio 1")

    }
}