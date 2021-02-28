package com.example.reciclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class AlunoViewHolder(view: View): RecyclerView.ViewHolder(view){
    val name by lazy {view.findViewById<TextView>(R.id.tv_name)}
    val matricula by lazy {view.findViewById<TextView>(R.id.tv_matricula)}
    val cardView by lazy {view.findViewById<CardView>(R.id.card_view)}
    val imageAluno by lazy {view.findViewById<ImageView>(R.id.img_card)}
}