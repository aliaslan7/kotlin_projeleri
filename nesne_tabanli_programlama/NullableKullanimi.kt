package nesne_tabanli_programlama

fun main() {

    //tanımlama
    var str: String? = null


  str="merhaba"

    // 1.yöntem soru işareti kullanımı

    println("1.yontem: ${str?.trim()}")

    //2.yontem !! kullanımı

  //  println("2.yontem : ${str!!.trim()}")


    //3.yöntem if kontrolu


    if (str !=null)
    {
        println("yöntem 3: ${str.trim()}")
    }
    else
    {
        println("str: nulldur")
    }

    //4.yöntem

    str?.let {
        println("4.yöntem ${str.trim()}")
    }




}