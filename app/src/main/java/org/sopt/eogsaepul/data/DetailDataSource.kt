package org.sopt.eogsaepul.data

import org.sopt.eogsaepul.detailList.DetailListInfo

interface DetailDataSource {
    fun fetchData() : MutableList<DetailListInfo>
}