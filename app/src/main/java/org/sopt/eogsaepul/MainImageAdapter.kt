package org.sopt.eogsaepul

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.sopt.eogsaepul.databinding.ItemMainImgBinding

class MainImageAdapter: RecyclerView.Adapter<MainImageAdapter.MainViewHolder>() {
    val mainImageList = mutableListOf<MainImageData>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MainViewHolder {
        val binding = ItemMainImgBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )

        binding.ivMainImg.clipToOutline = true

        return MainViewHolder(binding)
    }

    override fun getItemCount(): Int = mainImageList.size

    override fun onBindViewHolder(
        holder: MainViewHolder,
        position: Int
    ) {
        holder.onBind(mainImageList[position])
    }

    class MainViewHolder(
        private val binding: ItemMainImgBinding
    ): RecyclerView.ViewHolder(binding.root){
        fun onBind(mainImageData: MainImageData){

            binding.tvMainTitle.text = mainImageData.mainTitle
            

        }
    }
}