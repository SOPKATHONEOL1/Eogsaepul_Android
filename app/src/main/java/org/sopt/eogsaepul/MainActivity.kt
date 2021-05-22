package org.sopt.eogsaepul

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_main_img.view.*
import org.sopt.eogsaepul.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainImageFragment = MainImageFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fg_main, mainImageFragment)
        transaction.commit()

        actionFloating()
    }


    fun actionFloating(){
        binding.fabUp.setOnClickListener{
            binding.fgMain.rv_main_list.smoothScrollToPosition(0);
        }
    }
}