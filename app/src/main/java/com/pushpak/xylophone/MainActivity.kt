package com.pushpak.xylophone

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.pushpak.xylophone.ui.theme.XylophoneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            XylophoneTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Xylophone()
                }
            }
        }
    }
}

@Composable
fun MyBox(
    color: Color,
    mediaPlayer: MediaPlayer,
    modifier: Modifier = Modifier
) {
    Box(
        modifier
            .fillMaxSize()
            .background(color = color)
            .clickable {
                mediaPlayer.start()
            })
}

@Composable
fun Xylophone() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize()
    )
    {
        MyBox(
            color = colorResource(id = R.color.red),
            modifier = Modifier.weight(1f),
            mediaPlayer = MediaPlayer.create(context, R.raw.assets_note1)
        )
        MyBox(
            color = colorResource(id = R.color.orange),
            modifier = Modifier.weight(1f),
            mediaPlayer = MediaPlayer.create(context, R.raw.assets_note2)
        )
        MyBox(
            color = colorResource(id = R.color.yellow),
            modifier = Modifier.weight(1f),
            mediaPlayer = MediaPlayer.create(context, R.raw.assets_note3)
        )
        MyBox(
            color = colorResource(id = R.color.green),
            modifier = Modifier.weight(1f),
            mediaPlayer = MediaPlayer.create(context, R.raw.assets_note4)
        )
        MyBox(
            color = colorResource(id = R.color.blue),
            modifier = Modifier.weight(1f),
            mediaPlayer = MediaPlayer.create(context, R.raw.assets_note5)
        )
        MyBox(
            color = colorResource(id = R.color.white),
            modifier = Modifier.weight(1f),
            mediaPlayer = MediaPlayer.create(context, R.raw.assets_note6)
        )
        MyBox(
            color = colorResource(id = R.color.purple),
            modifier = Modifier.weight(1f),
            mediaPlayer = MediaPlayer.create(context, R.raw.assets_note7)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    XylophoneTheme {
        Xylophone()
    }
}