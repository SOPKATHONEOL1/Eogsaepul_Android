package org.sopt.eogsaepul

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import org.sopt.eogsaepul.data.CategoryData
import org.sopt.eogsaepul.databinding.FragmentCategoryBinding

class CategoryFragment:Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding?: error("View를 참조하기 위해 binding이 초기화 되지 않았습니다.")
    private lateinit var categoryAdapter: CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryAdapter = CategoryAdapter()
        binding.rvCategoryList.adapter = categoryAdapter
        binding.rvCategoryList.layoutManager = LinearLayoutManager(requireContext()).also {
            it.orientation = LinearLayoutManager.HORIZONTAL
        }

        categoryAdapter.categoryList.addAll(
            listOf<CategoryData>(
                CategoryData(
                    categoryTitle = "남자 연예인"
                ),
                CategoryData(
                    categoryTitle = "여자 연예인"
                ),
                CategoryData(
                    categoryTitle = "동물"
                ),
                CategoryData(
                    categoryTitle = "SOPT"
                )
            )
        )
        categoryAdapter.notifyDataSetChanged()
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}