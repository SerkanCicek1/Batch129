package day02datatypesmethodcreation;

public class Variables01 {

    //primitive data types --> char - boolean - byte - short - int - long - float - double
    //float:  virgullu sayilar icin(Ondalik Sayi - Decimal Numbers) icin kullanilir (4 byte)
    //double: virgullu sayilar icin(Ondalik Sayi - Decimal Numbers) icin kullanilir (8 byte)

    //Note 1: primitive data type'larini Java olusturmustur, biz olusturamayiz
    //Note 2: primitive data type'larinin isimlerinde sadece kucuk harf kullanilir
    //Note 3: primitive data'lar data type'lara gore memory'de farki farkli yer kaplarlar
    //Note 4: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar


    public static void main(String[] args) {

        //Ornek: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyatı ekrana yazdırınız
        //Note: Java "Decimal Numbers" i otomatik olarak "double" kabul eder
        //      Siz data type'ini "float" yazarsaniz hata verir.
        //      Float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz

        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        //System.out.println() ekrana yazdirir ve "pointer" i bir alt satira koyar
        //System.out.println() ekrana yazdirir ve "pointer" i ayni satirsa tutar
        //System.out.println() yazdirmanin kisa yolu ==> sout yaz ve enter'a bas

        System.out.println(shirtPrice + shoesPrice);

        //Ornek: Hucre agirligi ve amip'in agirligi icin iki tane variable olusturup agirliklari farkini ekrana yazdir

        double weightCell = 0.000365724;
        double weightAmip = 0.000042626;

        System.out.println(weightCell - weightAmip);
        // 3.23098E-4 "E ==> Exponent" Burdaki E 3.23098 carpi 10 uzeri -14



    }

}
