package org.sopt.eogsaepul

import android.content.Intent
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.sopt.eogsaepul.data.CategoryData
import org.sopt.eogsaepul.data.MainImageData
import org.sopt.eogsaepul.databinding.ItemCategoryBinding
import org.sopt.eogsaepul.databinding.ItemMainImgBinding

class CategoryAdapter : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    val categoryList = mutableListOf<CategoryData>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryViewHolder {
        val binding = ItemCategoryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CategoryViewHolder(binding)
    }

    override fun getItemCount(): Int = categoryList.size

    override fun onBindViewHolder(
        holder: CategoryViewHolder,
        position: Int
    ) {
        holder.onBind(categoryList[position])
    }
    class CategoryViewHolder(
        private val binding: ItemCategoryBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(categoryData: CategoryData) {
            binding.tvCategoryTitle.text = categoryData.categoryTitle
            itemView.setBackgroundResource(R.color.white)
            itemView.setOnClickListener {
                itemView.setBackgroundResource(R.drawable.button_tab_box)
            }
        }
    }


}

