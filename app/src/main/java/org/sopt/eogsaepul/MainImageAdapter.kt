package org.sopt.eogsaepul

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.sopt.eogsaepul.data.MainImageData
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

            itemView.setOnClickListener{ view ->
                val intent = Intent(view.context, DetailActivity::class.java)
                view.context.startActivity(intent)
            }

        }
    }
}