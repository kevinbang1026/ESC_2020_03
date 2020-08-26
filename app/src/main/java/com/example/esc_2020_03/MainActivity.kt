package com.example.esc_2020_03

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ml = Intent(this,movie_list_activity::class.java)
        btnBoxOffice.setOnClickListener {
            startActivity(ml)
        }

        btnNaverMovie.setOnClickListener {
            val nm = Intent(Intent.ACTION_VIEW, Uri.parse("https://movie.naver.com/"))
            startActivity(nm)
        }
    }
}