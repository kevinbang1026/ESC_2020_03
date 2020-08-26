package com.example.esc_2020_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_movie_list_activity.*

class movie_list_activity : AppCompatActivity() {

    val mov_list = arrayListOf<movie>(
        movie("터넷", 62.34, "이건 영화", "2020-08-26", R.drawable.m2),
        movie("소년 시절의 ", 16.26, "이건 영화", "2020-07-09", R.drawable.m4),
        movie("덩케르크 이스케이프", 11.94, "이건 영화", "2020-08-03", R.drawable.m3),
        movie("짱구는 못말려: 신혼여행 허리케", 10.46, "이건 영화", "2020-08-07", R.drawable.m1)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list_activity)

        val adapter = movie__adapter(this, mov_list)
        mov_recyc.adapter = adapter

        val lm = LinearLayoutManager(this)
        mov_recyc.layoutManager = lm
    }
}