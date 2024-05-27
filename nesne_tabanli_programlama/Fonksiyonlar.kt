package nesne_tabanli_programlama

class Fonksiyonlar {

    //void - geri döünüş değeri olmayan

    fun selamlama1()
    {
        val sonuc ="merahaba ali"
        println(sonuc)
    }
//return- geri donuş değeri olan
    fun selamlama2(): String{
        val sonuc ="merhaba ali "
        return sonuc
    }

    //parametre

    fun selamlama3(isim: String)
    {
        val sonuc=isim
        println("merhaba $sonuc")
    }

    fun toplam1(sayi1: Int,sayi2: Int)
    {
        val sonuc=sayi1+sayi2
        println("sonuc: $sonuc")
    }

    //overloding
    fun carp(sayi1: Double,sayi2: Int){
        println("sonuc: ${sayi2*sayi1}")
    }
    fun carp(sayi1: Int,sayi2: Double){
        println("sonuc: ${sayi2*sayi1}")
    }
    fun carp(sayi1: Int,sayi2: Int){
        println("sonuc: ${sayi2*sayi1}")

    }
    fun carp(sayi1: Int,sayi2: Int,isim : String){
        println("sonuc: ${sayi2*sayi1} işlemi yapan $isim")
    }
}