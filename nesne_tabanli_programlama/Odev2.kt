package nesne_tabanli_programlama

class Odev2 {
    fun soru1(km: Double): Double {
        val Mile = km * 0.621
        return Mile
    }

    fun dikdortgen(k1: Int, k2: Int) {
        val alan = k1 * k2
        println("Diktorgenin alanı : $alan")
    }

    fun faktoryel(sayi: Int): Int {
        var fak = 1
        var i = 1
        while (i <= sayi) {
            fak = fak * i
            i++
        }
        return fak
    }

    fun kelimekontrol(kelime: String): Int {
        return kelime.count { it == 'e' }
    }

    fun acıhesapla(kenarsayisi: Int, ): Int {


        return ((kenarsayisi - 2) * 180) / kenarsayisi
    }

    fun maaşhesap(gun: Int, saat: Int, ):Int {
        val toplamsaat = gun * saat
        val maasi = gun * saat * 40

        if (toplamsaat > 150) {
            val maas = (150 * 40) + ((toplamsaat - 150) * 80)
            println("maaşı: $maas")
        }
        return maasi
    }

    fun otoparkucreti(saat: Int):Int{

        if (saat>1)
        {
            val ucret=(10*(saat-1))+50
            println("otopark ücreti: $ucret tldir")
        }
        else if(saat<=1)
        {
            println("otopar ucreti 50tldir")
        }
            return 0
    }


    }



