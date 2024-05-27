package nesne_tabanli_programlama

class Kamyon (var adı: String, var rengi : String, var maxhız :Int){

    init {
        println("conctructor çalıştı ")
    }
    fun hızlan (kaçkm: Int){
        maxhız += kaçkm
    }
    fun hızkontrol(maxhız: Int)
    {
        if (maxhız >=150)
        {
            println("hız limitini aştınız ")
            println("lütfen yavaslayın.. " +
                    "hızınız: $maxhız")
        }
        else {
            println("hıznız uygundur " +
                    "hıznız: $maxhız")
        }
        return
    }
    fun bilgilerigoster()
    {
        println("ADI:  $adı \n" +
                "RENGİ: $rengi\n" +
                "MAXHIZ: $maxhız")
    }

}