package com.example.remainingassignments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_activity_item_row.view.*

class RVAdapter(private val l: List<List<String>>): RecyclerView.Adapter<RVAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.recycler_view_activity_item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = l[position]

        holder.itemView.apply {
            tv1.text = item[0]
            tv2.text = item[1]
            tv3.text = item[2]
            tv4.text = item[3]
        }
    }

    override fun getItemCount(): Int = l.size
}