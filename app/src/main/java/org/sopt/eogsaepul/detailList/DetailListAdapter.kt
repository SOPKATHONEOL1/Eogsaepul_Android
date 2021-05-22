package org.sopt.eogsaepul.detailList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DetailListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    lateinit var binding: ItemDetailBinding
    val detailList = mutableListOf<DetailListInfo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        binding = ItemDetailBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return DetailListAdapter.DetailListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DetailListViewHolder, position: Int) {
        holder.onBind(detailList[position])
    }

    class DetailListViewHolder(
        private val binding: ItemDetailBinding

    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(detailList: DetailListInfo) {

            binding.tv.text=detailList.name
            binding.repoDetail.text=detailList.content
            binding.repoLanguage.text=detailList.like

        }
    }
}