package com.ajieno.bengkuluview.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ajieno.bengkuluview.R
import com.ajieno.bengkuluview.model.Wisata
import com.ajieno.bengkuluview.util.ListWisataAdapter.*
import com.squareup.picasso.Picasso

class ListWisataAdapter(private val listwisata: ArrayList<Wisata>) : RecyclerView.Adapter<ListViewHolder>(){

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var txtTitle: TextView = itemView.findViewById(R.id.txt_title)
        var txtDesc: TextView = itemView.findViewById(R.id.txt_description)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_wisata, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listwisata.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val wisata = listwisata [position]

        Picasso.get().load(wisata.photo).into(holder.imgPhoto)

        holder.txtTitle.text = wisata.name
        holder.txtDesc.text = wisata.detail
    }
}