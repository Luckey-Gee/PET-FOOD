package com.example.vistas5.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vistas5.R
import com.example.vistas5.comidaMascota

class ComidaMascotaAdapter(private val comidamascotaList:List<comidaMascota>, private val onClickListener:(comidaMascota) -> Unit) : RecyclerView.Adapter<ComidaMascotaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComidaMascotaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ComidaMascotaViewHolder(layoutInflater.inflate(R.layout.item_comidamascota, parent, false))

    }

    override fun onBindViewHolder(holder: ComidaMascotaViewHolder, position: Int) {

        val item = comidamascotaList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = comidamascotaList.size
}