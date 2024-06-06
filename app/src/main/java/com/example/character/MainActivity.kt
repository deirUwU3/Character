package com.example.character

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.character.god.data
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import com.example.character.model.Charac
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.character.ui.theme.CharacterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CharacterTheme {
                genshin()
            }
        }
    }

    @Composable
    fun genshin() { // connected to the start of the game the name of the App  SportApp
        impact(
            charlist = data().a()
        )
    }




    @Composable
    fun  charCard(charac: Charac, modifier: Modifier = Modifier) {
        Card(modifier = modifier) {
            Column {
                Image(
                    painter = painterResource(charac.imageResourceId),
                    contentDescription = stringResource(charac.stringResourceId),
                    modifier = Modifier
                        .fillMaxWidth() // width of the card the will be use
                        .height(300.dp), // height of the picture in the app
                    contentScale = ContentScale.FillBounds
                )
                Text(
                    text = LocalContext.current.getString(charac.stringResourceId), // string resource id in sports.kt
                    modifier = Modifier.padding(7.dp), // padding of the text in the app
                    style = MaterialTheme.typography.headlineMedium // fontsize of the text in the app
                )



            }
        }
    }
        @Composable
        fun impact(charlist: List<Charac>, modifier: Modifier = Modifier) {
            LazyColumn(modifier = modifier) {
                items(charlist) { charac ->
                    charCard(
                        charac = charac,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }

    }







