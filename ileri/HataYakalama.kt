package ileri

fun main() {

    //1.Compaile Error -> çalıştırmadan once alınan hata

    /*val x = 10
    x=300   error hatası */


    //2.Exception: Runtime Error -> çalıştırdıktan sonra alınan hataa

    val a = 10
    val b = 0



    try {
        println("sonuc : ${a/b}")// bunu çalıştırır fakat hata alırız exeption
        println("işlem tamam")   // bu tur hataları kontrol altına almalıyız.

    }catch (e:Exception)
    {
        println("bir sayı sıfıra bölünemez")
    }
}