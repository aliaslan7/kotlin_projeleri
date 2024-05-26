package standart_programlama

fun main() {


    //12345 sırayla yazdırmak


    for (i in 1..5)
    {
        println("Döngü $i: $i")
    }
    println("\n")

    //10 ile 50 arsındaki sayıları 5 er 5 er artırarak yazdırsın

    for (i in 10..50 step 5)
    {
     println("Döngü : $i")

    }
    println("\n")

    // 50 10 a azalan

    var sayac=1 // sayacın değeri sürekli değişecegi için val yerine var kullanılır..
    for (i in 50 downTo 10 step 5)// azalan döngülerde DownTo kullanılır.
    {
        println("Döngü $sayac: $i")
        sayac++
    }


        var  a =1
    while (a<6)
    {
        println("Döngü : $a")
        a++
    }



}