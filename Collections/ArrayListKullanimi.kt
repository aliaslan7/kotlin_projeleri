package Collections

fun main() {
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    meyveler.add("elma")//0.indeks
    meyveler.add("karpuz")//1.indeks
    meyveler.add("çilek")//2.indeks

    println(meyveler)

    //veri güncelleme

    meyveler[1] = "kavun "
    println(meyveler)

    //insert verilen indekse eklme

    meyveler.add(1,"portakal") //yazılan indekse elaman yerleştirme.
    println(meyveler)

    //okuma islemi

    //ikiside kullanılır.
    println(meyveler[2])
    println(meyveler.get(1))


    println("boyutu : ${meyveler.size}")
    println("boyutu: ${meyveler.count()}")
    println("bos mu : ${meyveler.isEmpty()}")
    println("içeriyor mu : ${meyveler.contains("portakal")}")

    meyveler.reverse()//var olan içeriği teres çevirir.

    meyveler.sort()//içeriği sıralar..
    println(meyveler)

    //ArrayListin içdekileri sırayla bastırmak

    for (meyve in meyveler)
    {
        println("sonuc: ${meyve}")

    }
    //indekslerinide yazmak için


    for ((index,meyve) in meyveler.withIndex())
    {
        println("sonuc $index : $meyve")
    }

    //istediğimiz index ten veri silme

    meyveler.removeAt(1)
//hepsini silmek için

    meyveler.clear()


}