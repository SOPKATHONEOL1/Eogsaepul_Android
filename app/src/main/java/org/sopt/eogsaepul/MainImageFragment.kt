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
                    mainImage = "dl",
                    mainTitle = "dl"
                ),
                MainImageData(
                    mainImage = "dl",
                    mainTitle = "dl"
                ),
                MainImageData(
                    mainImage = "dl",
                    mainTitle = "dl"
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
