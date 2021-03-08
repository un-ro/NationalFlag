package com.unero.nationalflag.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.unero.nationalflag.R
import com.unero.nationalflag.data.Nation

class NationAdapter(private val list: ArrayList<Nation>): RecyclerView.Adapter<NationAdapter.ViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Nation)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.item_name)
        var imgFlag: ImageView = itemView.findViewById(R.id.item_flag)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_nation, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nation = list[position]

        holder.imgFlag.setImageResource(nation.flag)
        holder.tvName.text = nation.name

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(list[position]) }
    }

    override fun getItemCount() = list.size
}