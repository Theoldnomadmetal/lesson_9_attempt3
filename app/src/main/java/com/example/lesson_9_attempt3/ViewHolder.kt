package com.example.lesson_9_attempt3

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_recycle.view.*
import kotlinx.android.synthetic.main.item_recycle_2.view.*

class ViewHolder(view:View):RecyclerView.ViewHolder(view) {


    fun bind(item:String){
        itemView.tvIcon?.text = item
        itemView.tvIcon2?.text = item


    }
}