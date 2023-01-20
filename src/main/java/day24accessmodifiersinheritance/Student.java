package day24accessmodifiersinheritance;
public class Student {

    // name herkes tarafindan bilinebilir, o yuzden "public"
    public String name = "Tom Hanks";

    // student Id okul yonetimindeki insanlar tarafindan bilinebilir, o yuzden "default"
    String stdId = "TH2023HU12001";

    // account number ben, esim ve cocuklarim tarafindan bilinebilir, o yuzden "protected"
    protected int accountNum = 76512345;

    // hesabimdaki para miktari sadece benim tarafimdan bilinmelidir, bu yuzden "private"
    private int balance = 123000;

    /*
    1) Access modifier'lar genisden dara; public > protected > default > private
    2) Class'lar protected ve private olamazlar, sadece public ve default olabilirler

       a) "publicler" icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
       b) "protected" ayni packagein icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
       c) "default" sadece ayni packageden ulasilabilir. Bu yuzden defaultlarin diger adi package private'dir
       d) "private" sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz

       e) protected ile defaultun farki nedir ?
         Package disina ciktigimizda childlardan protectedlara ulasabiliriz, defaultlarda ulasamayiz.
     */


}
