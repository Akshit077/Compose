package com.example.urbantech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import com.example.urbantech.ui.theme.UrbanTechTheme

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{

        }
    }

    @Composable
    fun ImageCard(painter:Painter,
    contentDescription:String,
    title:String,
    modifier: Modifier = Modifier) {

    }

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UrbanTechTheme {

    }
}
}