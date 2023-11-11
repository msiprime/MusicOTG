package com.msicoding.musicotg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.msicoding.musicotg.data.local.remote.model.SpotifyTrack
import com.msicoding.musicotg.ui.theme.MusicOTGTheme
import com.msicoding.musicotg.ui.viewmodel.MusicViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.lifecycle.viewmodel.compose.viewModel


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicOTGTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    MusicScreen()
                }
            }
        }
    }
}

@Composable
fun MusicScreen(viewModel: MusicViewModel = viewModel()) {
    Column {
        Text(text = "MusicOTG App", style = MaterialTheme.typography.bodyLarge)
        MusicList(musicList = viewModel.musicList)
    }
}

@Composable
fun MusicList(musicList: List<SpotifyTrack>) {
    LazyColumn {
        items(musicList) { track ->
            Text(text = track.name)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MusicOTGTheme {
        MusicScreen()
    }
}
