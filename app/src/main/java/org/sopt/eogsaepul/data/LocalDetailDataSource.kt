package org.sopt.eogsaepul.data

import org.sopt.eogsaepul.detailList.DetailListInfo

class LocalDetailDataSource : DetailDataSource {
    override fun fetchData(): MutableList<DetailListInfo> {
        return mutableListOf(
            DetailListInfo(
                name = "댓글1",
                content = "안녕하세요안녕하세요",
                like = 654
            ),
            DetailListInfo(
                name = "댓글1",
                content = "안녕하세요안녕하세요",
                like = 654
            ),
            DetailListInfo(
                name = "댓글1",
                content = "안녕하세요안녕하세요",
                like = 654
            ),
            DetailListInfo(
                name = "댓글1",
                content = "안녕하세요안녕하세요",
                like = 654
            )
        )
    }
}