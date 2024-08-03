package com.example.githubrepoapp.Screens.Issues.model

import java.text.SimpleDateFormat

data class IssuesDataModel(
    val Title:String,
    val exist: Boolean,
    val date: SimpleDateFormat,
    val   open: Boolean


)