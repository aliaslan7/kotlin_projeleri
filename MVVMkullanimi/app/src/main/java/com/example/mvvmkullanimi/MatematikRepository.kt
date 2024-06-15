package com.example.mvvmkullanimi

class MatematikRepository {

var msd = MatematikDataSource()
        suspend fun toplamaYap(alinansayi1:String,alinansayi2: String): String

        = msd.toplamaYap(alinansayi1,alinansayi2)

        suspend  fun carpmaYap(alinansayi1:String,alinansayi2: String) : String
        = msd.carpmaYap(alinansayi1,alinansayi2)
}