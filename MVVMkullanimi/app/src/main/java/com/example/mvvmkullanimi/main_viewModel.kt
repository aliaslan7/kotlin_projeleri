package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.merge
import kotlinx.coroutines.launch

class main_viewModel : ViewModel() {


    var sonuc = MutableLiveData("0")

    var mrepo =MatematikRepository()

    fun toplamaYap(alinansayi1:String,alinansayi2: String){
        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mrepo.toplamaYap(alinansayi1,alinansayi2)
        }
    }
    fun carpmaYap(alinansayi1:String,alinansayi2: String){
        CoroutineScope(Dispatchers.Main).launch {
            sonuc.value = mrepo.carpmaYap(alinansayi1,alinansayi2)
        }
    }
}