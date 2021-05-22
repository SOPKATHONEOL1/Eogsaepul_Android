package org.sopt.eogsaepul.data.response

data class ResponseDetailData(
    val status : Int,
    val data : DetailData?
)

data class DetailData(
    val image : String,
    val reply : List<DetailDataList>
)

data class DetailDataList(
    val replyText : String,
    val replyIndex : Int,
    val like : Int
)