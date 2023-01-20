package day03scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        //Ornek: Kullanicidan sayilari alarak toplama islemi yaptiran kodu yaziniz


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz:");
        double sayi1 = scan.nextDouble();
        System.out.println("Lütfen bir sayi giriniz:");
        double sayi2 = scan.nextDouble();

        System.out.println("Toplam : " + (sayi1 + sayi2));









    }

}
