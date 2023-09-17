package com.murali.neat_root_suraj.execes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.murali.neat_root_suraj.databinding.ItemListRvBinding

class Adapter(var dataList: ArrayList<Model>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    inner class MyViewHolder(var binding: ItemListRvBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var binding = ItemListRvBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
         holder.binding.imageView.setImageResource(dataList.get(position).img)
         holder.binding.textview.text = dataList.get(position).name

    }


}