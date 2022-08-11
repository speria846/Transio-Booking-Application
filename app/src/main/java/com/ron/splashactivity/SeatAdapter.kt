package com.ron.splashactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

abstract class SeatAdapter(var SeatList:List<Routes>):
    RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.seats_list_item,parent ,false)
        return ContactViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=SeatList.get(position)
//        holder.imageView27.text=currentContact.image

    }

    override fun getItemCount(): Int {
        return SeatList.size

    }
}
class ContactViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvSeats=itemView.findViewById<TextView>(R.id.tvSeats)
    var imageView27=itemView.findViewById<ImageView>(R.id.imageView27)

    //    var tvLocation=itemView.findViewById<TextView>(R.id.tvLocation)
//    var imageView=itemView.findViewById<ImageView>(R.id.imageView)
}