package day03scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //Ornek: Kullanicidan alinan 5 basamakli bir sayinin, ilk iki ve son iki basamagindaki rakamlarin toplamini yazdirin kodu yaziniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 5 basamakli bir sayi giriniz:");
        int sayi = scan.nextInt(); //12345

        int ilkIkiRakam = sayi / 1000;
        System.out.println("Ilk iki rakam: " + ilkIkiRakam);
        int ilkIkiToplam = (ilkIkiRakam % 10) + (ilkIkiRakam / 10 );
        System.out.println("ilkIkiToplam = " + ilkIkiToplam);

        int sonIkiRakam = sayi % 100;
        System.out.println("Son iki rakam: " + sonIkiRakam);
        int sonIkiToplam = (sonIkiRakam % 10) + (sonIkiRakam / 10);
        System.out.println("Son iki rakam toplam: " + sonIkiToplam);

        System.out.println("Sonuç: " + ilkIkiToplam + " ve " + sonIkiToplam);










    }

}
