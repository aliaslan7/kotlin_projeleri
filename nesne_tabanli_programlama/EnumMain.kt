package nesne_tabanli_programlama

fun main() {


ucrethespala(10,KonserveBoyutu.BUYUK)

}
fun ucrethespala(adet: Int,boyutu: KonserveBoyutu){

    when (boyutu){
        KonserveBoyutu.BUYUK -> println("toplam tutar: ${adet*30}₺")
        KonserveBoyutu.ORTA -> println("toplam tutat: ${adet*20}₺")
        KonserveBoyutu.KUCUK -> println("toplam tutar: ${adet*10}₺")

    }
}