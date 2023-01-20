package day25inheritance;

public class Vehicle {

    /*
        1) Child Class'dan bir object olusturdugunuzda Constructor'lar en ustteki
           parent class'dan baslatilarak alta dogru calistirilir.
        2) Child Class'daki constructor'dan Parent Class'daki constructor'a gidebilmek icin "super()" kullanilir
        3) Parent Class'da biren fazla constructor varsa istenilen constructor, super() ifadesinin parantezi icine
           yazilan parametreleri yardimi ile secilebilir
        4) Ayni Class icindeki constructor'lari secmek icin "this()" kullanilir
           Ayni Class'da birden fazla constructor varsa istenilen constructor, "this()" ifadesinin icine yazilan
           parametreler yardimi ile secilebilir.
        5) "super()" ifadesini yazmak istege baglidir, yazmasaniz da Java sanki "super()" varmis gibi davranir.
           ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
        6) "super()" ve "this()" ifadeleri constructor icinde her zaman ilk satirda olmalidir.
        7) Bir constructor icinde "super()" ve "this()" ifadeleri sadece bir kere kullanilabilir. Bakiniz 6. kural...
        8)
     */

    public int price = 12000;

    public void engine(){
        System.out.println("Vehicle engine...");
    }

    public Vehicle(){
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){
        System.out.println("Vehicle 2: " + price);
    }



}
