package org.sopt.eogsaepul.data.response

data class ResponseMainData(
    val status : Int,
    val data : MainData?
)

data class MainData(
    val image : String,
    val title : String,
    val datailIdx : Int
)