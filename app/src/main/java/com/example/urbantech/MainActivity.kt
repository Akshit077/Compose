package com.example.urbantech

import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.cardview.widget.CardView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.urbantech.ui.theme.UrbanTechTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            Row(
//                modifier = Modifier
//                    .background(Color.Green)
//                    .border(5.dp, Color.Magenta)
//                    .padding(5.dp)
//                    .border(10.dp, Color.Blue)
//                    .padding(5.dp)
//                    .border(10.dp, Color.Red)
//                    .padding(10.dp)
//            ) {
//                Greeting("ComposeExample")
//                MessageCard(message = "Work so hard that your acc balance looks like phone no.")
//                MessageCard2(message = "The lights are cut out but you still working on yours dreams")
//            }
//            Spacer(modifier = Modifier.width(10.dp)
//                .height(10.dp))
//
//            Row(modifier = Modifier.padding(start = 20.dp, top = 100.dp)
//                .offset(0.dp, 20.dp))
//            {
//                ImageGroup(name = "Akshit Chauhan", title = "This is verified user")
//            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!",
        modifier = Modifier
            .padding(start = 10.dp, top = 10.dp)
            .offset(0.dp, 20.dp)
            .clickable { })
}

@Composable
fun LoginButton(label:String) {

}

@Composable
fun ImageGroup(name:String,title:String) {
    Row(

    ) {
        Image(
            painter = painterResource(id = R.drawable.demo_img),
            contentDescription = "Profile picture verified user",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.width(8.dp))

        Column() {
            Text(text = name)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = title)
        }
    }
}

@Composable
fun MessageCard(message:String) {
    Text(text = "Message for today: $message!!",
        modifier = Modifier
            .padding(start = 10.dp, top = 10.dp)
            .offset(0.dp, 20.dp))
}

@Composable
fun MessageCard2(message:String) {
    Text(text = "Quote: $message", modifier = Modifier
        .padding(start = 10.dp, top = 10.dp)
        .offset(0.dp, 20.dp)
        .border(5.dp, Color.Yellow))
}

@Composable
fun ImageCard(painter:Painter,
              contentDescription:String,
              title:String,
              modifier:Modifier = Modifier)
{
   Image(painter = painter, contentDescription = contentDescription, title = title,
   modifier = modifier.fillMaxWidth()
       .shadow(
           elevation = 5.dp,
           shape = RoundedCornerShape(5.dp),
           clip = true
       )
       .clip(RoundedCornerShape(5.dp)

   )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UrbanTechTheme {
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(Color.Green)
//                .border(5.dp, Color.Magenta)
//                .padding(5.dp)
//                .border(10.dp, Color.Blue)
//                .padding(5.dp)
//                .border(10.dp, Color.Red)
//                .padding(10.dp)
//
//        ){
//            Greeting("ComposeExample")
//            MessageCard(message = "Work so hard that your acc balance looks like phone no.")
//            MessageCard2(message = "The lights are cut out but you still working on yours dreams")
//        }
        ImageGroup(name = "Akshit Chauhan", title = "This is Verified User")
    }
}