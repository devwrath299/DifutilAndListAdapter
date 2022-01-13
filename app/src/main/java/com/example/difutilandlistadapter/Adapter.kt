package com.example.difutilandlistadapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.ListAdapter

class Adapter : ListAdapter<Items, Adapter.vh>(Diffutil()) {

    class vh(view:View) :RecyclerView.ViewHolder(view)
    {
        var name=view.findViewById<TextView>(R.id.textView)

        fun bind(items: Items)
        {
            name.text =items.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): vh {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return vh(view)
    }

    override fun onBindViewHolder(holder: vh, position: Int) {
        var Item=getItem(position)
        holder.bind(Item)
    }

    class Diffutil:DiffUtil.ItemCallback<Items>(){
        override fun areItemsTheSame(oldItem: Items, newItem: Items): Boolean {
            return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(oldItem: Items, newItem: Items): Boolean {
          return oldItem==newItem
        }

    }
}