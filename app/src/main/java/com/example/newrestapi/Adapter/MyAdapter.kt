package com.example.newrestapi.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newrestapi.R
import com.example.newrestapi.model.Address
import kotlinx.android.synthetic.main.item.view.*

class MyAdapter:RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemview: View):RecyclerView.ViewHolder(itemview){
        fun populateModel(model:Address){
            itemView.tvId.text = model.country
            itemView.tvCreationTimeSeconds.text = model.state
            itemView.tvCommentatorHandle.text = model.city
        }
    }
    var models: List<Address> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        models?.get(position)?.let { holder.populateModel(it) }
    }

    override fun getItemCount(): Int =  models?.size ?: 0
}