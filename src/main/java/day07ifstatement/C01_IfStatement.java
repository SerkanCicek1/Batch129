package day07ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        //if it rains, I will cancel the picnic


        //Example: Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran kodu olusturunuz
        char ch = 'S';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf");
        }


        //Example: Verilen sayi cift ise ekrana "Cift Sayi" yazdiran kodu olusturunuz
        int sayi1 = 8;

        if (sayi1 % 2 == 0) {
            System.out.println("Cift Sayi");
        }


        //Example: Verilen sayi 300'den kucuk veya 1200'den buyuk ise "Harika Sayi" yazdiran kodu olusturunuz
        int sayi2 = 478;

        if (sayi2 < 300 || sayi2 > 1200) {
            System.out.println("Harika Sayi");
        }


        //Example: Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazdiran kodu olusturunuz
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz: ");
        int num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.println("Sayiniz cift");
        } else if (num % 2 == 1) {
            System.out.println("Sayiniz tek");
        }


        //Example: Verilen bir sayinin negatif, pozitif ya da notr oldugunu yazdiran kodu olusturunuz

        int num2 = -21;

        if (num2 > 0){
            System.out.println("Sayiniz pozitif");
        }else if (num2 == 0){
            System.out.println("Sayiniz notr");
        }else{
            System.out.println("Sayiniz negatif");
        }




    }

}
