package com.example.mvvmxml.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.mvvmxml.R

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
      Row(modifier = Modifier.fillMaxWidth()) {
          Column {
              Text(text = "Hi Pamela", fontSize = 24.sp)
              Text(text = "Great to see you again!")
          }
          AsyncImage(
              model = "https://example.com/image.jpg",
              contentDescription = null,
              modifier = Modifier
                  .width(50.dp)
                  .height(50.dp)
                  .clip(
                      shape = RoundedCornerShape(25.dp)
                  ),
              alignment = Alignment.CenterEnd,
              contentScale = ContentScale.FillBounds
          )
      }
        Card (
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFCE8314))
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp)
        ){
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(modifier = Modifier
                    .width(50.dp)
                    .height(50.dp), painter = painterResource(id = R.drawable.star), contentDescription = "star")
                Column {
                    Text(text = "2300", fontSize = 24.sp)
                    Text(text = "Ranking")
                }
                Divider(
                    color = Color.Gray,
                    modifier = Modifier
                        .width(1.dp)

                )
            }
        }
    }
}


