package standart_programlama

fun main() {

    val yas = 17
    val isim ="ali"

    if (yas>=18){

        println("$isim  $yas den büyük veya eşittir")

    }
    else
        println("$isim 18 den küçüktür")
    println("$isim $yas ' yasındadadır")



    val ka = "admin "
    val s = 1234556

    if (ka=="admin " && s==123456 ){

        println("giriş başarılı ")
    }
    else if (ka=="admin" && s != 123456){
        println("giriş hatalı ")
        println("şifre hatalı ")

    }
    else if (ka != "admin " && s == 123456){
        println("giriş hatalı ")
        println("şifre yanlış ")
        println("tekrar deneyiniz")
    }
    else {
        println("giriş hatalı ")
        println("kullanııcı adı ve şifre hatalı ")
    }


    val gun =23
println("\n")
    when (gun){

        1-> println("pazartesi")
        2-> println("salı")
        3-> println("çarşamba")
        4-> println("perşembe")
        5-> println("cuma")
        else -> println("boyle bir gun yok")


    }

}