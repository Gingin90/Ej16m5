package com.example.ej16m5
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ej16m5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), Adapter.PaisCallback {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
    }

    private fun initAdapter() {
        val adapter = Adapter()
        adapter.setData(PaisesLatam.paises)
        adapter.callback= this
        binding.recyclerView.adapter

    }

    override fun showcountry(s: String) {
        binding.textView2.text= s
    }


}




