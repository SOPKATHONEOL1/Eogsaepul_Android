package org.sopt.eogsaepul

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.sopt.eogsaepul.data.MainImageData
import org.sopt.eogsaepul.databinding.FragmentMainImgBinding

class MainImageFragment: Fragment() {

    private var _binding: FragmentMainImgBinding? = null
    private val binding get() = _binding?: error("View를 참조하기 위해 binding이 초기화 되지 않았습니다.")
    private lateinit var mainImageAdapter: MainImageAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainImgBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mainImageAdapter = MainImageAdapter()
        binding.rvMainList.adapter = mainImageAdapter

        mainImageAdapter.mainImageList.addAll(
            listOf<MainImageData>(
                MainImageData(
                    mainImage = R.drawable.img_sopt_4,
                    mainTitle = "조별과제 발표하는데 떠는 날 보고 잘하고 있다며 고개 끄덕여 주는 잘생긴 우리 조 조장 선배"
                ),
                MainImageData(
                    mainImage = R.drawable.img_sopt_2,
                    mainTitle = "헤어지자고 했더니 내가 더 잘할게요 한 번만 기회 주면 안돼요? 라면서 펑펑 우는 연하"
                ),
                MainImageData(
                    mainImage = R.drawable.img_sopt_5,
                    mainTitle = "인간 각도기"
                ),
                MainImageData(
                    mainImage = R.drawable.img_sopt_9,
                    mainTitle = "엘리베이터 문이 열리자 안으로 들어오는 대기업 회장 전남친"
                ),
                MainImageData(
                    mainImage = R.drawable.img_sopt_4,
                    mainTitle = "고백하러 가서 어버버 거리다가 죄송합니다!하고 도망치는데 무슨 말하려고 했는데~? 하면서 끝까지 쫓아오는 선배"
                ),
                MainImageData(
                    mainImage = R.drawable.img_sopt_1,
                    mainTitle = "데이트 날 커플 vlog 찍겠다고 아침부터 일찍 일어나 내가 좋아하는 옷 스타일 대로 입고 거울에 가서 브이하는 연상 애인"
                ),
                MainImageData(
                    mainImage = R.drawable.img_sopt_7,
                    mainTitle = "과제 공지 자꾸 올리는 팟장과 애써 무시하는 파트원"
                ),
                MainImageData(
                    mainImage = R.drawable.img_sopt_8,
                    mainTitle = "던 던 댄스 ~"
                )
            )
        )

        mainImageAdapter.notifyDataSetChanged()

    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
