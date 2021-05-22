package org.sopt.eogsaepul.data

import org.sopt.eogsaepul.detailList.DetailListInfo

class LocalDetailDataSource : DetailDataSource {
    override fun fetchData(): MutableList<DetailListInfo> {
        return mutableListOf(
            DetailListInfo(
                name = "댓글1",
                content = "인간 각도기",
                like = 654
            ),
            DetailListInfo(
                name = "댓글2",
                content = "씻고 나온 쌩얼로 나 예쁘냐고 물어보니까 고민하는 척 장난치는 남친",
                like = 175
            ),
            DetailListInfo(
                name = "댓글3",
                content = "끼부리는 표정 금지",
                like = 55
            ),
            DetailListInfo(
                name = "댓글4",
                content = "멜빵 입고 나와서 귀엽다하니까 귀엽다하지말라고 삐진 댕댕이 연하 썸남",
                like = 12
            )
        )
    }
}