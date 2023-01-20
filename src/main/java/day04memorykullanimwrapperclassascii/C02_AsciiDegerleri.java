package day04memorykullanimwrapperclassascii;

public class C02_AsciiDegerleri {

    /*
    ASCII = Amerikan Standart Kodlama Sistemi uluslararasi kabul gormus degerlerdir.
    Klavyede kullandigimiz harf ve sembollerin matematiksel karsiligi char data
    turunde  isleme alınırsa o char degerinin ASCİİ Table'daki karsiligini isleme alır.
    Harf ve sembollere deger atar .
    Karakterlerin cebirsel karsiligini bulmak icin ortaya cıkmıstır.
    Cunku bilgisayarda hersey "0" ve "1" den olusur.Bu yapıya cevirebilmek icin Ascii table olusmustur.
     */

    public static void main(String[] args) {

        //Bir tam sayi ile bir harfi toplayiniz

        int deger = 20;
        char harf = 'a';

        //1. Yol
        int sum = deger + harf; // 20 + 97(a nın ascii degeri)
        System.out.println("Bir tam sayi ile harfin toplami: " + sum); //117

        //2. Yol
        System.out.println("2. Yol Toplam: " + (deger + harf));
        
        
        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1); //1

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2); //2

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3); //3

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1 + rakam2 + rakam3 + rakam4 = " + rakam1 + rakam2 + rakam3 + rakam4); //1234
        System.out.println("rakam1 + rakam2 + rakam3 + rakam4 = " + (rakam1 + rakam2 + rakam3 + rakam4)); //202 (ascii degerleri topladı)


        char kh = 'a';
        char bh = 'A';
        System.out.println("a'nin Ascii degeri = " + (kh + 0)); //97
        System.out.println("A'nin Ascii degeri = " + (bh + 0)); //65

        System.out.println("kh > bh ==> " + (kh > bh)); //true  Karsilastirma islemlerinin sonucu "True" ya da "False" doner.


        //Herhangi bir karakterin Ascii degerini hesaplayalim

        //1. Yol
        char space = ' ';
        System.out.println("Spacenin Ascii degeri = " + (space + 0)); //32


        /*
        char data type'larinda Java karaktere int deger de atanabilir,
        cunku char data type'larin bir resim, bir de Ascii'den gelen int degeri vardir
        bu sekilde de Ascii degerini bulabiliriz
         */

        //2. Yol
        int hrf = 'm';
        System.out.println("int harfinin = " + hrf); //109

        /// *************ASCII degerlerinden yararlanarak Karsilastirma Yapabiliriz ****************\\\\\

        byte b = 125;
        float f = 2.45648f;
        long l = 54565125511144L;
        char ch = 'h';
        System.out.println(l > ch); //true
        System.out.println(b < f);  //false
        System.out.println(b < ch); //false






    }

}
