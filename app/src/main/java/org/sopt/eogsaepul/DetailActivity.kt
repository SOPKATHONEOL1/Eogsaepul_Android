package org.sopt.eogsaepul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sopt.eogsaepul.databinding.ActivityDetailBinding
import org.sopt.eogsaepul.detailList.DetailListAdapter

class DetailActivity : AppCompatActivity() {
    private val detailListAdapter = DetailListAdapter()
    lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }



    private fun initDetailView(){
        binding.rvCommentList.adapter = detailListAdapter
    }
}