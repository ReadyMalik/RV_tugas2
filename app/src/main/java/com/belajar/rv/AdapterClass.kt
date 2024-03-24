package com.belajar.rv

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class AdapterClass (private val dataList: ArrayList<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.rvImage.setImageResource(currentItem.dataImage)
        holder.rvName.text = currentItem.dataTitle
        holder.rvNIM.text = currentItem.dataNIM
    }

    override fun getItemCount(): Int {
        return dataList.size

    }


    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView) {
        val rvImage: ImageView = itemView.findViewById(R.id.image)
        val rvName:TextView = itemView.findViewById(R.id.title)
        val rvNIM:TextView = itemView.findViewById(R.id.tv_description)
    }
}