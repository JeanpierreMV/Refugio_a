package com.example.refugio_a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.refugio_a.ui.theme.Refugio_aTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Refugio_aTheme {//muy importante las mayusculas o minusculas
                    MyComponent()
                }


        }
    }
}

@Composable
fun MyComponent(){
        Row(modifier = Modifier.padding(8.dp)) {
            Myimagen()
            Mytexts()
        }
}
@Composable
fun Myimagen(){
   Image(painterResource(R.drawable.ic_launcher_foreground) , contentDescription = "prueba de imagen",
       modifier= Modifier
           .size(64.dp)
           .clip(CircleShape)
           .background(MaterialTheme.colorScheme.primary)
       //.background(Color.Green)
   )
}

@Composable
fun Mytexts(){
    Column(modifier = Modifier.padding(8.dp)) {
        MyText( "prueba 1")
        Spacer(modifier = Modifier.height(16.dp))
        MyText( "prueba 2")
    }
}
@Composable
fun MyText(text: String ){
    Text(text)
}

@Preview(showSystemUi = true)
@Composable
fun previewtext(){
    MyComponent()
}
