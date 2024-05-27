package nesne_tabanli_programlama.Kalitim.override_Kullanımı

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar()
    memeli.sesCikar()
    kedi.sesCikar()
    kopek.sesCikar()
}