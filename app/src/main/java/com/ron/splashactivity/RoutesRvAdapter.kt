package com.ron.splashactivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RoutesRvAdapter(var RoutesList:List<Routes>):
    RecyclerView.Adapter<ContactHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.routes_list_items,parent ,false)
        return ContactHolder(itemView)

    }

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        var currentContact=RoutesList.get(position)
        holder.tvRoute1.text=currentContact.routes

    }

    override fun getItemCount(): Int {
        return RoutesList.size

    }
}
class ContactHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvRoute1=itemView.findViewById<TextView>(R.id.tvRoute1)
    var imageView18=itemView.findViewById<ImageView>(R.id.imageView18)

    //    var tvLocation=itemView.findViewById<TextView>(R.id.tvLocation)
    var imageView=itemView.findViewById<ImageView>(R.id.imageView)
     }