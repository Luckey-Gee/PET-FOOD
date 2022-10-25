package com.example.vistas5.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.vistas5.comidaMascota
import com.example.vistas5.databinding.ItemComidamascotaBinding

class ComidaMascotaViewHolder(view:View):ViewHolder(view) {

    val binding = ItemComidamascotaBinding.bind(view)

    fun render (
        comicalMascot: comidaMascota,
        onClickListener: (comidaMascota) -> Unit,
        onClickDelete: (Int) -> Unit
    ){

        binding.tvAnimal.text = comicalMascot.animal
        binding.tvMarca.text = comicalMascot.marca
        binding.tvEdad.text = comicalMascot.edad
        Glide.with(binding.ivComida.context).load(comicalMascot.foto).into(binding.ivComida)
        itemView.setOnClickListener {onClickListener(comicalMascot)}
        binding.btnBorrar.setOnClickListener{ onClickDelete(adapterPosition)}
    }
}
