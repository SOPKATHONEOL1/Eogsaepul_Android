package org.sopt.eogsaepul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.sopt.eogsaepul.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mainImageFragment = MainImageFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fg_main, mainImageFragment)
        transaction.commit()
    }


}