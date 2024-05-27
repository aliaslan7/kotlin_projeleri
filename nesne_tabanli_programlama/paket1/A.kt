package nesne_tabanli_programlama.paket1

 open class A {

    var vardeğişken = 1 //her yerden ulaşılabilir
    public  var publicdeğişken = 2 // her yereden ulaşılabilir
    protected  var protecteddeğişken = 3 // kalıtım olursa ulaşılabilir onun için class başına open yazılır
    internal var internaldeğişken = 4 //modullerde kullanılır
    private  var privatedeğişken = 5 // sadece class içinde kullanılır.

}