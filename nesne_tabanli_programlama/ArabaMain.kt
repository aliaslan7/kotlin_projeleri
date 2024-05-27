package nesne_tabanli_programlama

fun main() {

    val Bmw =Araba("Bmw", "siyah ",150,true )
    Bmw.bilgilerigoster()
    println("---------------------")
    Bmw.durdur()
    Bmw.bilgilerigoster()
    println("\n")
    println("****************************************")



    Bmw.hızlan(50)
    Bmw.bilgilerigoster()
    println("****************************************")

    Bmw.yavasla(20)
    Bmw.bilgilerigoster()

  }