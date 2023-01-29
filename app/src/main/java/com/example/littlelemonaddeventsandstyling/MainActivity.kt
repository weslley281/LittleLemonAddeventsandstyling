package com.example.littlelemonaddeventsandstyling

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemonaddeventsandstyling.ui.theme.LittleLemonAddEventsAndStylingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonAddEventsAndStylingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LowerPanel()
                }
            }
        }
    }
}

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecialCard()
        MenuDish()
    }
}

@Composable
fun WeeklySpecialCard(){
    Card(
        modifier = Modifier.fillMaxWidth()
    ){
        Text(
            text = "Semana Especial",
            fontSize = 26.sp,
            fontWeight =  FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun MenuDish(){
    Card() {
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp) ) {
            Column {
                Text(
                    text = stringResource(id = R.string.product),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(id = R.string.description),
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 5.dp)
                        .fillMaxWidth(.75f)
                )
                Text(
                    text = stringResource(id = R.string.price),
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
            }
            Image(
                painter = painterResource(id = R.drawable.greeksalad),
                contentDescription = ""
            )
        }
    }
    Divider(
        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        color = Color.LightGray,
        thickness = 1.dp
        )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LittleLemonAddEventsAndStylingTheme {
        LowerPanel()
    }
}