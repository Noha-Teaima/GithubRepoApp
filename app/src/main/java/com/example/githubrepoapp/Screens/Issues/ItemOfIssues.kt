package com.example.githubrepoapp.Screens.Issues

import android.graphics.drawable.PaintDrawable
import android.graphics.drawable.shapes.OvalShape
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageBitmapConfig
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toBitmap
import com.example.githubrepoapp.R
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


@ExperimentalMaterial3Api
@Composable
fun ItemOfIssues(
    Title:String,
    exist: Boolean,
    date: SimpleDateFormat,
    open: Boolean
) {


      Row (

          modifier = Modifier
              .padding(bottom = 8.dp, end = 8.dp)
              .clip(RoundedCornerShape(20.dp))

//              .border(BorderStroke(3.dp, color = Color.Yellow),
//                  shape = RoundedCornerShape(15.dp))
              .background(Color.White)
              .fillMaxWidth()

      ){

//
              Image(
                  modifier = Modifier
                      .padding(end = 10.dp, start = 10.dp, top = 8.dp)
                      .size(30.dp),
                  painter = painterResource(id = R.drawable.circle),

                  contentDescription = null,

              ) ;





          Column(
              modifier = Modifier
                  .padding(start = 8.dp, top = 10.dp, bottom = 30.dp)
                  .width(250.dp)
                  .height(70.dp)
          ) {

                  Text(text = Title,
                      maxLines = 1,
                      overflow = TextOverflow.Ellipsis,
                      fontWeight = MaterialTheme.typography.headlineLarge.fontWeight ,
                      fontSize = MaterialTheme.typography.titleLarge.fontSize

                  )
              Text(text = if (exist==true) stringResource(R.string.exist) else stringResource(R.string.notExist),
                  fontSize = MaterialTheme.typography.bodyMedium.fontSize)

              Row {
                  Text(text = stringResource(R.string.created_at),

                      fontWeight = MaterialTheme.typography.labelLarge.fontWeight
                  );
                  Text(text = " ${ date.format(Date()) }", fontSize = MaterialTheme.typography.bodyMedium.fontSize)
              }
              }

          Text(text =
          if(open==true ) stringResource(R.string.open)
          else stringResource(R.string.close) ,
              modifier = Modifier.padding(top = 10.dp, start = 20.dp)

          )
          }








}


@ExperimentalMaterial3Api
@Preview(
    showBackground = true)
@Composable
private fun PreviewItemOfIssues() {


        ItemOfIssues("Bump payarrow from 7 noha noha ", false,
            SimpleDateFormat("dd-MM-yyyy, HH:mm  a",Locale.US),true)

    
}

//@Composable
//fun loadxmlDrawable(@DrawableRes resId:Int):
//        ImageBitmap?=
//    ContextCompat.getDrawable(LocalContext.current
//,resId)?.toBitmap()?.asImageBitmap()