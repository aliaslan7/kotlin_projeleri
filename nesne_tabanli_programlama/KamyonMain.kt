package nesne_tabanli_programlama

fun main() {
    val scania= Kamyon("Scania","siyah",0)

    scania.bilgilerigoster()
    scania.hızlan(0)
    scania.bilgilerigoster()
    println("****************************")
    scania.hızkontrol(150)
    scania.bilgilerigoster()
    println("****************************************")
    scania.hızlan(10)
    scania.bilgilerigoster()
}