package com.example.refugio_a.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SecondScreen(){
    Scaffold() {
        SecondBodyContent()
    }
}

@Composable
fun SecondBodyContent(){
    Column(
        modifier =Modifier.fillMaxSize(),//para que ocupe todo el espacio
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("gola navegation")
        Button(onClick = { /*TODO*/ }) {
            Text("Volver atrás")

        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondDefaultPreview(){
    SecondScreen()
}
