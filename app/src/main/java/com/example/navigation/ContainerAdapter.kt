package com.example.navigation

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class ContainerAdapter(var items: List<OpenData>, var context: Context) :
    RecyclerView.Adapter<ContainerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_container, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titleTextView.text = items[position].title
        holder.moneyTextView.text = items[position].money
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val titleTextView = view.findViewById<TextView>(R.id.title_textview)
        val moneyTextView = view.findViewById<TextView>(R.id.money_textview)
    }
}