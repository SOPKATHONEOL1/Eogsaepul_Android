package org.sopt.eogsaepul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sopt.eogsaepul.data.DetailDataSource
import org.sopt.eogsaepul.data.LocalDetailDataSource
import org.sopt.eogsaepul.databinding.ActivityDetailBinding
import org.sopt.eogsaepul.detailList.DetailListAdapter
import org.sopt.eogsaepul.detailList.DetailListInfo

class DetailActivity : AppCompatActivity() {
    private val detailListAdapter = DetailListAdapter()
    lateinit var binding: ActivityDetailBinding
    private lateinit var detailDataSource : DetailDataSource
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        initDetailView()
        setContentView(binding.root)
    }



    private fun initDetailView(){
        binding.rvCommentList.adapter = detailListAdapter
        detailListAdapter.data = fetchData()
    }

    private fun fetchData() : MutableList<DetailListInfo> {
        detailDataSource = LocalDetailDataSource()
        return detailDataSource.fetchData()
    }
}