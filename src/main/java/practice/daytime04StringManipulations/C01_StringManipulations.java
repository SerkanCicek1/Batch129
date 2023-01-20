package practice.daytime04StringManipulations;

import java.util.Scanner;

public class C01_StringManipulations {
    /*
     String Class Methodlari

          1)equals(): a)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                      b)equals() method'u "boolean" return eder.

          2)equalsIgnoreCase(): a)Iki tane String'in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar.
                                b) equalsIgnoreCase() method'u "boolean" return eder.

          3)toLowerCase(): a)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                           b)toLowerCase() method'u "String" return eder

          4)toUpperCase(): a)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                           b) toUpperCase() method'u "String" return eder

          5)charAt(): a) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                      b) charAt() method'u "char" return eder.

          6)length(): a) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                      b) length() method'u "int" return eder.

          7)contains(): a)Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
                        b) contains() method'u "boolean" return eder.

          8)split(): a)Bir String'i istedigimiz character'den parcalamaya yarar
                           b)split() method'u "Array" return eder.

          9)replace (): a)Metin icerisindeki karakter ya da karakterlerin,
                              istenilen karakter ya da metinle degistirilmesini saglar.
                              Sonuc String'dir..

          10)replaceFirst(): a)Replace ile aynı sadece ilk bulunan karakteri değiştirir

          11) + Concat: Bir stringe diğerini ekler.
            Concatenation: Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
            her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.
         Not: Java soldan saga ve yukaridan asagi calisir


         12)Regular Expression(regex): Belli turdeki characterleri secebilmemize yarar.
         1) \\d   ==> tum rakamlar
            \\D   ==> tum rakam disi character ler

         2) \\w  ==> A->Z        a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
            \\W  ==> A->Z        a->z         0->9    _ disindaki hersey

         3) \\s  ==> space tum bosluklar
            \\S  ==> space disindaki hersey
     */

    public static void main(String[] args) {

        System.out.println(15 + 20 + "Merhaba"); // 35Merhaba

        System.out.println("Merhaba" + 15 + 20); // Merhaba1520

        System.out.println("Merhaba" + (15 + 20)); // Merhaba35

        System.out.println("Merhaba" + 15 * 20); // Merhaba300


        // Kullanicidan ismini ve soyismini girmesini isteyin ve kullanici nasil girerse girsin console' buyuk harf olarak yazdirin
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String isim = scan.next(), soyisim = scan.next(); // multiple declaration == coklu tanimlama
        String tamIsim = isim.concat(" " + soyisim.toUpperCase());

        System.out.println("tamIsim = " + tamIsim);


        // Rakam haricindekileri silin
        String str = "45.99 $";
        str = str.replaceAll("\\D", "");
        System.out.println("str = " + str); // 4599


        //Verilen bir cumleyi 10.karaktere kadar "*" yapıp gerisini normal yazdirin.
        String cumle = "Her dert Java gibi olsa";
        String cumle1 = cumle.substring(0,10).replaceAll("\\w","*");
        System.out.println(cumle1 + cumle.substring(10));


        //a harfi yerine @ isareti yerlestiriniz
        String kelime = "olaganustu";
        System.out.println(kelime.replace("a","@"));


        // "Kalem " yerine "biber" yazdirin
        String str2 = "Dolma Kalem ile bir Dunya kaleme aldik";
        System.out.println(str2.replaceAll("Kalem","biber"));//Dolma biber ile bir Dunya kaleme aldik

        String str3 = "bugun hava yagmurlu";
        System.out.println(str3.length());//19

        String str4="";
        System.out.println("str4.length() = " + str4.length());//0
        String str5=" ";
        System.out.println("str5.length() = " + str5.length());//1


        //Kullanicidan isim ve soyisim alip hangisinin daha uzun oldugunu yazdiriniz
        System.out.println("Lutfen isim ve soyisim giriiniz: \nisim: ");
        String name = scan.next();
        System.out.println("soyisim: ");
        String surName = scan.next();

        if (name.length() > surName.length()){
            System.out.println("Isminiz daha uzun");
        } else if (name.length() == surName.length()){
            System.out.println("Isminiz ve soyisminiz aynı uzunlukta");
        } else System.out.println("Soyisminiz daha uzun");













    }

}
