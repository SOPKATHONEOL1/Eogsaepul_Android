package org.sopt.eogsaepul.detailList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.sopt.eogsaepul.databinding.ItemDetailBinding


class DetailListAdapter : RecyclerView.Adapter<DetailListAdapter.DetailListViewHolder>(){
    lateinit var binding: ItemDetailBinding
    private val _data = mutableListOf<DetailListInfo>()
    var data: List<DetailListInfo> = _data
        set(value) {
            _data.clear()
            _data.addAll(value)
            notifyDataSetChanged()
        }

    class DetailListViewHolder(private val binding: ItemDetailBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(detailList: DetailListInfo) {
            binding.tvCmtName.text=detailList.name
            binding.tvCmtContent.text=detailList.content
            binding.tvCmtNum.text=detailList.like.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailListViewHolder {
        binding = ItemDetailBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DetailListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DetailListViewHolder, position: Int) {
        holder.onBind(_data[position])
    }

    override fun getItemCount(): Int {
        return _data.size
    }


}