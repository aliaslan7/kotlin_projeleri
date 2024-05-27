package nesne_tabanli_programlama.İnterace_kullanimi

class ClassA :Myİnterface {
    override val degisken: Int=10


    override fun metod1() {
       println("metod1 çaılıştı ")
    }

    override fun metod2(): String {
       return "metod2 çalıştı "
    }


}