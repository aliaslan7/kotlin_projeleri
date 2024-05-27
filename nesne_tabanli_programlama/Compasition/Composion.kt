package nesne_tabanli_programlama.Compasition

fun main() {

    val k1 = Katagoriler(1,"Dram")
    val k2 = Katagoriler(2,"bilim kurgu")

    val y1 = Yonetmenler(1,"ali aslan" )
    val y2 = Yonetmenler(2,"can kurumus")

    val f1 = Filmler(1,"Django",2013,y1,k1)
    val f2 = Filmler(2,"ASLAN",2023,y2,k2)

    println("film id: ${f1.film_id}")
    println("film ad: ${f1.film_ad}")
    println("film yıl: ${f1.film_yil}")
    println("film katagori: ${f1.katagori.katagori_ad}")
    println("film yonetmen: ${f1.yonetmen.yonetmen_ad}")



}