package com.example.esc_2020_03

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

data class movie(
    val title : String,
    val pop : Double,
    val des : String,
    val open : String,
    val poster_url : Int
)

class movie__adapter(val context: Context, val mov_list: ArrayList<movie>) : RecyclerView.Adapter<movie__adapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.cell, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return mov_list.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(mov_list[position])
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mov_poster = itemView.findViewById<ImageView>(R.id.mov_poster)
        val mov_title = itemView.findViewById<TextView>(R.id.mov_title)
        val mov_pop = itemView.findViewById<TextView>(R.id.mov_pop)
        val mov_des = itemView.findViewById<TextView>(R.id.mov_des)
        val mov_open = itemView.findViewById<TextView>(R.id.mov_open_date)
        val container = itemView.findViewById<ConstraintLayout>(R.id.container)

        fun bind(movie: movie) {
            mov_poster.setImageResource(movie.poster_url)
            mov_title.text = movie.title
            mov_pop.text = "인기도: " + movie.pop
            mov_des.text = "설명: " + movie.des
            mov_open.text = "개봉일: " + movie.open

            container.setOnClickListener{
                Toast.makeText(context, mov_title.text, Toast.LENGTH_SHORT).show()
            }
        }
    }
}