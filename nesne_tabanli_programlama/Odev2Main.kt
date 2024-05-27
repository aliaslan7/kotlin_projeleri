package nesne_tabanli_programlama

import java.lang.ref.PhantomReference

fun main() {
    val o2=Odev2()

    println("SORU 1")
   val sonuc1=o2.soru1(20.0)
    println(sonuc1)

    println("**************************")

    println("SORU 2")
    o2.dikdortgen(10,20)

    println("**************************")

    println("SORU 3")
    val sonuc=o2.faktoryel(5)
    println("faktoryel sonuc: $sonuc")

    println("**************************")

    println("SORU 4 ")
    val sonuc2=o2.kelimekontrol("elma")

    println("kelimemizde $sonuc2 kadar e harfi geçmektedir3")

    println("**************************")
    println("SORU 5")

    val sonuc5=o2.acıhesapla(5)
    println("bir iç açısı = $sonuc5")

    println("**************************")

    println("SORU 6")
    val  sonuc6=o2.maaşhesap(20,10)
     println("maaş: $sonuc6")

   println("**************************")

    println("SORU 7")
   val sonuc7=o2.otoparkucreti(10)
   println(sonuc7)





}