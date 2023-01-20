package day08nestedif;

import java.util.Scanner;

public class C03_NestedIf {

    public static void main(String[] args) {

        /*
        Kullanicidan 0'dan kucuk ve 120'den buyuk deger giremeyecek sekilde datalari aldiktan sonra:
           a) Eger calisan kadinsa, 60 yasindan buyukse "Emekli Olabilir" yazdirin
           b) Eger calisan erkekse, 65 yasindan buyukse "Emekli Olabilir" yazdirin

         */


        //   BURASI BENİM YAZDIGIM

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cinsiyet = input.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        if (yas > 0 && yas < 120) {

            if (cinsiyet.equalsIgnoreCase("Erkek")) {

                if (yas > 65) {
                    System.out.println("Emekli Olabilir");
                } else System.out.println("Emekli olamaz");

            } else if (cinsiyet.equalsIgnoreCase("Kadin") || cinsiyet.equalsIgnoreCase("Bayan")) {

                if (yas > 60) {
                    System.out.println("Emekli Olabilir");
                } else System.out.println("Emekli olamaz");

            } else {
                System.out.println("Lutfen cinsiyeti dogru giriniz");
            }

        } else System.out.println("Lutfen yas degerini kontrol ediniz");


        //   BURASI HOCANIN YAZDIGI

    /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz \nKadin icin K harfi \nErkek icin E harfi giriniz");
        char cinsiyet = input.next().toUpperCase().charAt(0);//Kullanicinin verdigi harfi buyuk harfe cevirdim

        System.out.println("Lutfen yasinizi giriniz");
        int yas = input.nextInt();

        if (cinsiyet == 'K') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen giridiginiz yas degerini kontrol ediniz");
            } else if (yas > 60) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli Olamazsin " + (60 - yas) + " yil daha  calisman gerekir");
            }

        } else if (cinsiyet == 'E') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen giridiginiz yas degerini kontrol ediniz");
            } else if (yas > 65) {
                System.out.println("Emekli olabilirsin");
            } else {
                System.out.println("Emekli Olamazsin " + (65 - yas) + " yil daha calisman gerekir");
            }

        } else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }

    */


    }

}