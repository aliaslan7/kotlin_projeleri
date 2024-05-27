package nesne_tabanli_programlama

class Araba (var araba_adı : String ,var renk: String , var hız :Int , var calısıyormu : Boolean) {



    fun durdur(){
        calısıyormu= false
        hız =0
    }

    fun bilgilerigoster (){
        println(" ADI:${araba_adı}\n" +
                " HIZI:${hız}\n" +
                " RENGİ:${renk}\n" +
                " ÇALIŞIYORMU:${calısıyormu}")
    }

    fun hızlan (kackm : Int)
    {
        hız +=kackm

    }
    fun yavasla (kackm: Int )
    {
        hız -=kackm
    }
}