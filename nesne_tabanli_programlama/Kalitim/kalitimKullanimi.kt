package nesne_tabanli_programlama.Kalitim



fun main() {
    var topkapiSarayi = Saray(150,500)
    var aslanVilla = Villa(true,30)

    println("TOPKAPISARAYI")
    println("pencer sayısı: ${topkapiSarayi.pencereSayisi}")
    println("kule sayısı : ${topkapiSarayi.kuleSayisi}\n")

    println("ASLAN VİLLA ")
    println("pencere sayısı: ${aslanVilla.pencereSayisi}")
    println("garaji var mı: ${aslanVilla.garajVarmi}")
}