package com.example.vistas5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vistas5.adapter.ComidaMascotaAdapter
import com.example.vistas5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecicleView()
    }
    private fun initRecicleView(){
        val manager =  LinearLayoutManager(this)
        val decoration = DividerItemDecoration(this, manager.orientation)
        binding.recyclerasd.layoutManager = manager
        binding.recyclerasd.adapter = ComidaMascotaAdapter(ComidaMascotaProvider.comidaMascotaList
        ) { comidaMascota ->
            onItemSelected(
                comidaMascota
            )
        }
        binding.recyclerasd.addItemDecoration(decoration)
    }
    fun onItemSelected(comidaMascota:comidaMascota){

        Toast.makeText(this, comidaMascota.marca, Toast.LENGTH_SHORT).show()
        
    }

}