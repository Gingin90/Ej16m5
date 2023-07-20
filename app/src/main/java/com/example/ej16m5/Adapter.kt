package com.example.ej16m5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.ej16m5.databinding.ItemBinding


class Adapter: RecyclerView.Adapter<Adapter.ViewHolder>() {
    var paises = mutableListOf<Pais>()
    var callback: PaisCallback ?=null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return paises.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = paises[position]
        holder.bind(item)

    }
     fun setData(ListaPaises:List<Pais>){
         this.paises = ListaPaises.toMutableList()
     }

      inner class ViewHolder( val binding : ItemBinding):RecyclerView.ViewHolder(binding.root){
         fun bind(pais:Pais){
             binding.textViewList.text= pais.nombre
             binding.imageView.load(pais.imgUrl)
             binding.cardView.setOnClickListener(View.OnClickListener {
                 val texto = "Pais:${pais.nombre} Poblacion:${pais.poblacion}"
               callback?.showcountry(texto)


             })
         }



     }
         interface PaisCallback{
             fun showcountry(s:String)
         }

}