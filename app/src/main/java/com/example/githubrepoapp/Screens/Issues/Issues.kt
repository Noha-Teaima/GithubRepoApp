package com.example.githubrepoapp.Screens.Issues

import AppBar
import android.annotation.SuppressLint
import android.icu.text.CaseMap.Title
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.githubrepoapp.R
import com.example.githubrepoapp.Screens.Issues.model.IssuesDataModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun Issues(

) {

    val issuesList= listOf(
        IssuesDataModel(
            Title = "Bump pyarrow from 7 to 8  ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
open = true
        ),
        IssuesDataModel(
            Title = "Francias ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        ),
        IssuesDataModel(
            Title = "Bump werkzeug from 7 to 9  ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        ),
        IssuesDataModel(
            Title = "Bump utllib3 from 1.2 to 6",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        )
        , IssuesDataModel(
            Title = "ORQA fine tuning with  ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        )
        , IssuesDataModel(
            Title = "Bump pyarrow from 7 to 8  ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        )
        , IssuesDataModel(
            Title = "Bump pillow from 9.2   ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = false
        )
        , IssuesDataModel(
            Title = "Bump pyarrow from 7 to 8  ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        )
        , IssuesDataModel(
            Title = "T  ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        )
        , IssuesDataModel(
            Title = "Bump pyarrow from 7 to 8  ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        )
        , IssuesDataModel(
            Title = "Bump pyarrow from 7 to 8  ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        )
        , IssuesDataModel(
            Title = "Bump pyarrow from 7 to 8  ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        )
        , IssuesDataModel(
            Title = "Bump pyarrow from 7 to 8  ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        )
        , IssuesDataModel(
            Title = "Bump pyarrow from 7 to 8  ",
            exist = false,
            date = SimpleDateFormat("dd-MM-yyyy, HH:mm  a", Locale.US),
            open = true
        )
    )

Scaffold(
    Modifier.background(Color.Blue)
) {

    Column {
        AppBar(title = stringResource(R.string.issuesName), showBackArrow =true )
        LazyColumn (
            modifier = Modifier
                .padding(top = 8.dp, bottom = 10.dp, start = 10.dp)

                .background(MaterialTheme.colorScheme.background)
        ){



            items(issuesList.size) {
                ItemOfIssues(
                    Title = issuesList[it].Title,
                    exist = issuesList[it].exist,
                    date = issuesList[it].date,
                    open = issuesList[it].open
                );

                Spacer(modifier = Modifier .padding(bottom = 8.dp)

                    .height(2.dp)
                    .width(370.dp)
                    .background(color = MaterialTheme.colorScheme.inversePrimary)

                )


            }
    }

    }
}

}

@ExperimentalMaterial3Api
@Preview(
    showBackground = true
)
@Composable
private fun PreviewIssues() {
    Issues()
    
}