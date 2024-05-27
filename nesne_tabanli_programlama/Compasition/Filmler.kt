package nesne_tabanli_programlama.Compasition

data class Filmler (var film_id: Int,
                    var film_ad:String,
                    var film_yil: Int,
                    var yonetmen:Yonetmenler,//yonetmen ve katagori composion olur
                    var katagori:Katagoriler) {
}