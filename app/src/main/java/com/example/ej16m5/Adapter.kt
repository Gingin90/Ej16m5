package com.example.ej16m5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ej16m5.databinding.ItemBinding
import com.example.kotlinexamples.Pais

class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {
     var paises = mutableListOf<Pais>()


     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding= ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder (binding)
     }

     override fun getItemCount(): Int {
        return paises.size
     }

     override fun onBindViewHolder(holder: ViewHolder, position: Int) {

         val item = paises[position]
         holder.bind(item)

     }
     class ViewHolder {

     }


}