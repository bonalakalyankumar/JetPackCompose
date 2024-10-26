package com.example.jetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeapp.ui.theme.JetPAckComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting()
        }
    }
}
@Composable
@Preview
fun Greeting() {
    val listOfMovies= mutableListOf<Movie>()
    listOfMovies.add(Movie(R.drawable.john_wick,"John Wick","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"John Wick_1","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"John Wick_Parabllum","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"John Wick_4","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"John Wick_5","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"keanue Reeves","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"notime to die","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"ford vs ferrari","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"love","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"John Wick","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"John Wick_1","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"John Wick_Parabllum","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"John Wick_4","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"John Wick_5","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"keanue Reeves","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"notime to die","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"ford vs ferrari","Lots Of Gunns"))
    listOfMovies.add(Movie(R.drawable.john_wick,"love","Lots Of Gunns"))


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn (){
            itemsIndexed(listOfMovies){
                index, item ->
                MovieUI(MovieName = item.MovieTitle, MovieSub =item.MovieSubTitle )

            }

        }
    }
}


@Composable
fun MovieUI(
    MovieName: String,
    MovieSub:String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Red),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.john_wick),
            contentDescription = "john wick Picture",
            modifier = Modifier
                .size(100.dp)
                .padding(5.dp)
                .border(4.dp, Color.Yellow, CircleShape),
            contentScale = ContentScale.Inside
        )

        Column(
            modifier = Modifier
                .background(Color.Black)
                .padding(15.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = MovieName,
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold

            )
            Text(
                text =MovieSub,
                color = Color.White,
                modifier = Modifier.padding(top = 10.dp)

            )
        }

    }
}
data class Movie(
    val MovieImage: Int,
    val MovieTitle: String,
    val MovieSubTitle:String
)



