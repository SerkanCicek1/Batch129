package day05typecastingstringmanipulations;

import java.util.Locale;

public class StringManipulations01 {

    //String bir non-primitive data type'dir ve ayni zamanda bir class'dir.

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example: "s" String'indeki tum character'leri buyuk harf yapiniz.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper); // JAVA IS EASY


        //Example: "s" String'indeki tum character'leri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower); // java is easy


        //Example: "s" String'indeki ilk character'i aliniz
        char firstChar = s.charAt(0);
        System.out.println(firstChar); // J


        //Example: "s" String'indeki ikinci ve sondan ikinci character'leri aliniz ve ekrana yan yana yazdiriniz
        char secondChar = s.charAt(1); // a
        char secondLastChar = s.charAt(10); // s

        // 1. Yol: Ayni satirda yazdirmak icin
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        // 2. Yol: Ayni satirda yazdirmak icin
        System.out.println("" + secondChar + secondLastChar);


        //Example: "s" String'inde kullanilan character sayisini bulunuz
        int sLenght = s.length();
        System.out.println(sLenght); // 12


        //Example: "s" String'indeki ilk 4 character'i aliniz
        //substring(0,4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric'dir..
        String sub1 = s.substring(0,4);
        System.out.println(sub1); // Java


        //Example: "s" String'indeki "is" kelimesini aliniz
        String sub2 = s.substring(5,7);
        System.out.println(sub2);


        //Example: "s" String'indeki "easy" kelimesini aliniz
        String sub3 = s.substring(8,12);
        System.out.println(sub3);


        //Bir character'den baslayip String'in sonuna kadar almak isterseniz ikinci index yazilmaz
        String sub4 =s.substring(8);
        System.out.println(sub4); // easy


        //Example: "s" String'inde "money" kelimesinin var olup olmadigini kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist); // false


        /*
        Bir method'u ogrenirken 3 seyi mutlaka ogrenin:
          a)Bu method ne is yapar ?
          b)Bu method'un farkli kullanimlari nasildir ?
          c)Bu method size ne return eder ? Yani return type (boolean, int, double vb.)
         */


        //Example: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart); // true


        //Example: "s" String'inin 6. character'den itibaren belli bir harfle baslayip baslamadigini kontrol ediniz
        boolean isBegin = s.startsWith("i",5); // toffset gorme demek, burda 5 den öncesini isleme almiyor
        System.out.println(isBegin);








    }

}
