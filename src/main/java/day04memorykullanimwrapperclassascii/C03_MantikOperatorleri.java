package day04memorykullanimwrapperclassascii;

public class C03_MantikOperatorleri {

    //10 < sayi MantikOperatoru sayi < 20
    //Esittir icin çift == kullanilir  = tek esittir atama (assigment) yapar

    /*
    Java uclu karsilastirma yapamaz
    Ikili karsilastirma yapip Mantik operatorleriyle birlestirmeliyiz


    && ==>  and , ve
    || ==>  or , veya


    Cay       ve       limon
     +        &&         +   = true
     +        &&         -   = false
     -        &&         +   = false
     -        &&         -   = false


     && ile & arasindaki fark:
     &&'de boolean sonucta bir tane false bulunca durur.
     &'da ise tum satiri tarar sonra durur
     bu da &&'in  &'den daha hizli calismasini saglar.


     || veya operatoru Polyanacadiri.En ufak bir pozitiflikten true doner.

     Cay       veya       limon
      +         ||          +   = true
      +         ||          -   = true
      -         ||          +   = true
      -         ||          -   = false

     */

    public static void main(String[] args) {

        System.out.println(5 + 2 == 8); //false

        boolean sonuc1 = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8; //true
        System.out.println(sonuc1);

        boolean sonuc2 = 5 > 4 && 7 > 9 && 6 + 3 == 9 && 5 + 2 == 7; //false
        System.out.println(sonuc2);

        int sayi1 = 15;
        System.out.println(10 < sayi1 && sayi1 < 20); //true

        int sayi2 = 5;
        System.out.println(sayi2 < 10 || sayi2 > 20); //true






    }

}
