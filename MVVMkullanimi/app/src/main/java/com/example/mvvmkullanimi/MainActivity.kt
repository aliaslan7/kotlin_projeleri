package com.example.mvvmkullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
   private val viewModel: main_viewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.mainNesnesi = this

        viewModel.sonuc.observe(this){
            binding.hesaplamasonucu = it
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    fun buttontoplamaTıkla(alinansayi1:String,alinansayi2: String){
        viewModel.toplamaYap(alinansayi2,alinansayi1)


    }
    fun buttoncarpmaTıkla(alinansayi1:String,alinansayi2: String){

        viewModel.carpmaYap(alinansayi1,alinansayi2)


    }
}