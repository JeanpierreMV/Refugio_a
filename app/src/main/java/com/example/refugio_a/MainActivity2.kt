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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
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
import java.time.format.TextStyle


private val message:List<MyMessage> = listOf(
    MyMessage("hola que tal","estas ready xddd"),
    MyMessage("hola que tal1","estas ready xddd"),
    MyMessage("hola que tal2","estas ready xddd"),
    MyMessage("hola que tal3","estas ready xddd"),
    MyMessage("hola que tal4","estas ready xddd"),
    MyMessage("hola que tal5","estas ready xddd"),
    MyMessage("hola que tal6","estas ready xddd"),
    MyMessage("hola que tal7","estas ready xddd"),
    MyMessage("hola que tal8","estas ready xddd"),
    MyMessage("hola que tal9","estas ready xddd"),
    MyMessage("hola que tal10","estas ready xddd"),
    MyMessage("hola que tal11","estas ready xddd"),
    )
class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Refugio_aTheme {//muy importante las mayusculas o minusculas
                    MyMessages(message)
                }


        }
    }
}
data class  MyMessage(val title:String, val body:String)

@Composable
fun MyMessages(messages: List<MyMessage>){
    LazyColumn {
        items(messages){ message ->
            MyComponent(message)
        }
    }

}

@Composable
fun MyComponent(message: MyMessage){
        Row(modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(8.dp)) {
            Myimagen()
            Mytexts(message)
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

@Composable//esto define que es un elemento grafic
fun Mytexts(message: MyMessage){
    Column(modifier = Modifier.padding(8.dp)) {
        MyText(
            message.title,
            MaterialTheme.colorScheme.primary


        )
        Spacer(modifier = Modifier.height(16.dp))
        MyText(
            message.body,
            MaterialTheme.colorScheme.primary

        )
    }
}
@Composable
fun MyText(text: String, color: Color ){
    Text(text,color = color)
}

@Preview(showSystemUi = true)//show.. es para ver toda la pantalla
@Composable
fun PreviewComponent(){

    Refugio_aTheme {
        //val scrollState = rememberScrollState()
        //Column(modifier = Modifier.verticalScroll(scrollState)){
            MyMessages(message)
        //}

    }
}
