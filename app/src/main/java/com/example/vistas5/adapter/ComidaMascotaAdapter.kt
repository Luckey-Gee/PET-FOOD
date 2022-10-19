package com.example.vistas5.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ComidaMascotaAdapter(val comidamascotaList:List<ComidaMascotaViewHolder>) : RecyclerView.Adapter<ComidaMascotaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComidaMascotaViewHolder {

    }

    override fun onBindViewHolder(holder: ComidaMascotaViewHolder, position: Int) {
    }

    override fun getItemCount(): Int = comidamascotaList.size
}