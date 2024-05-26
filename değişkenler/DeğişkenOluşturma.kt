package değişkenler

fun main() {
    var OğrenciAdı="ali"
    var OğrenciYas=18
    var OğrenciBoy=1.75
    var OğrenciBaşharfi ='a'
    var OğrenciDevamEdiyormu=true

    println("adı: $OğrenciAdı")
    println(OğrenciBoy)
    println(OğrenciYas)
    println(OğrenciBaşharfi)
    println(OğrenciDevamEdiyormu)


    val numara = 12 //val kullanıldıgında değerini değiştiremiyoruz . var kullanırsak sonradan değerini değiştirebiir anlamına gelir.
    //val kullanmak daha mantıklı
    println("sayı: $numara")




    //tur dönüşümleri - type casting

    //sayısaldan sayısala




    val i =10
    val d=23.45

    val sonuc1=i.toDouble()
    val sonuc2=d.toInt()


    println(sonuc1)
    println(sonuc2 )

    //sayısaldan sayısala dönüşüm yaparken veri kaybına ugrayabiliriz o yuzden tehliklei bir dönüşümdğr.

//sayısaldan metine
    val sonuc3 = i.toString()// rakamsal olarak konsolda aynı yazacak ama sayılarımız artık string
    val sonuc4 = d.toString()
    println(sonuc3)
    println(sonuc4)



    val a ="45"

    val sonuc5 = a.toInt()
    println(sonuc5)


    val r = "12.45t"
    val sonuc6 =r.toDoubleOrNull()
    if (sonuc6 !=null)
    {
        println(sonuc6)
    }
    else
        println("hatalı sayı ")



    sonuc6?.let {//if kontrolune benzer ama else durumu yokurr.

    }

}