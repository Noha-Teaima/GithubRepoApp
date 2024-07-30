package com.example.githubrepoapp.Screens.RepoGithub

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.githubrepoapp.R

@Composable
fun ItemRepoGithub(



) {
    Modifier
        .fillMaxSize(1f)
        .fillMaxWidth(1f)
        .background(color = Color.White)
Row (
    modifier = Modifier
        .border(BorderStroke(2.dp,Color.Gray), shape = CircleShape)

        .padding(end = 20.dp),
    

    verticalAlignment = Alignment.CenterVertically
){
    
    Image( modifier = Modifier
        .size(70.dp)
        .padding(end = 5.dp),
        painter = painterResource(
        id =  R.drawable.baseline_share_24),


        contentDescription ="Image" );
    Column (
//        modifier = Modifier.width(250.dp)
    ){
        Text(text="Repo",
            fontSize = 20.sp)
        Text(text="Noha")
        Text(
            modifier = Modifier.fillMaxWidth(.75f),

            text = "Noha Noha Noha Noha Noha Noha Noha " +
                "Noha Noha Noha Kkkkkkk kkkkkkkkk", fontSize = 10.sp,

        )
    }




    Icon(
        imageVector = ImageVector.vectorResource(id = R.drawable.baseline_star_24),
        contentDescription = "Star",
        tint =  Color.Yellow


    );
    Text(
        text = "2365",
        fontSize = MaterialTheme.typography.bodyMedium.lineHeight,
//        modifier = Modifier.padding(10.dp)

    )


}

}


@Preview(
    showBackground = true,
    backgroundColor = 1,
    showSystemUi = true
    )
@Composable
private fun PreviewItem() {
    ItemRepoGithub()
    
}