@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.githubrepoapp.Screens.Details

import AppBar
import android.health.connect.datatypes.Device
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githubrepoapp.R

import kotlin.io.encoding.Base64

@Composable
fun Details(


) {

    

    Modifier
        .fillMaxHeight()
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.primaryContainer)

Column(
    modifier = Modifier
        .fillMaxHeight()


) {
AppBar(title = "Details", showBackArrow =true )


    Column(

        modifier = Modifier

            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primaryContainer)
            .padding(start = 20.dp, end = 20.dp, top = 20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally


    ) {


        Image(
            painter = painterResource(id = R.drawable.google),
            modifier = Modifier.size(150.dp),
            contentDescription = "Google"
        );
        Text(text = "language", fontWeight = FontWeight.Bold, fontSize = 20.sp);
        Row(


            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {


            DetailItem("2563",ImageVector.vectorResource(id = R.drawable.baseline_star_24),Color.Yellow)
            DetailItem("Python",ImageVector.vectorResource(id = R.drawable.baseline_circle_24),Color.Blue)
            DetailItem("356",ImageVector.vectorResource(id = R.drawable.baseline_share_24),null)


        }
        ;

        Text(

            text = "Shared repository for open-sourced" +
                    " projects from the Google AI Language team.",
            letterSpacing = MaterialTheme.typography.bodyLarge.letterSpacing,
            fontSize = MaterialTheme.typography.bodyMedium.lineHeight
        );





        TextButton(onClick = { /*TODO*/ },
            Modifier
                .padding(top = 305.dp)
                .background(Color.Blue)
                .width(300.dp)
                .height(40.dp)


        ) {
            Text(text = "Show Issues", color = Color.White, fontSize = 20.sp);

        };



    }

}

}

@Composable
 fun DetailItem(text: String,image:ImageVector,color:Color?) {
    Text(
        text = text,
        fontSize = MaterialTheme.typography.bodyMedium.lineHeight,
//        modifier = Modifier.padding(10.dp)

    )


    Icon(


        modifier = Modifier
            .padding(end = 20.dp, start = 5.dp)
            .size(25.dp),

        imageVector = image,
        contentDescription = "Star",
        tint =  if(color==null)
 Color.Black
        else color
    );
}

@Preview(showBackground = true,
    backgroundColor = 1,
    showSystemUi = true,
    name = "Pixel",

    )
@Composable
private fun PreviewDetails() {
    Details()
    
}