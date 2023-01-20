package day05typecastingstringmanipulations;

public class TypeCasting01 {

            /*
        Numeric primitive data type'larinin birbirine donusturulmesine "Type Casting" denir.
        Numeric (Sayisal) Data Type'lar ==> byte - short - int - long - float - double

        Note: Kucuk data type'larini buyuk data type'larina cevirmeyi Java otomatik olarak yapar.
              Bu isleme "AutoWidening" (Ootomatik Genisletme) denir.

        Note: Buyuk data type'larini kucuk data type'larina cevirmek risklidir.Java bu isi otomatik olarak yapmaz.
              Bu islemi kod yazan'lar yapar.Buna "ExplicitNarrowing" (Aciktan Daraltma) denir.

         */

    public static void main(String[] args) {

        // byte data type'ini int data type'ina ceviriniz
        byte age = 13;
        int ageInt = age; // AutoWidening


        // long data type'inin short data type'ina ceviriniz
        long weight = 234;
        short weightInt = (short)weight; // ExplicitNarrowing


        // int data type'ini float data type'ina ceviriniz

        int population = 716000;
        float populationFloat = population;


        //double data type'ini short data type'ina ceviriniz

        double number = 14.65;
        short numberShort = (short)number;

        //Dikkat!
        //Donusum yaptiginiz sayi (260), donuseceginiz data type'inin sinirlari disinda ise, Java kullandiginiz sayi
        //ile "mod" islemi yapar ve mod isleminin sonucu sizin yeni degeriniz olur. Mesela 260 % 256 = 4


        //Example:
        short num = 260;
        System.out.println(num); // 260

        byte numByte = (byte)num;
        System.out.println(numByte); // 4


        //Example:
        short n = 1023;
        System.out.println(n);

        byte nByte = (byte)n;
        System.out.println(nByte);






    }

}
