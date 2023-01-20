package day11loops;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {

        // 5'den 10'a kadar tam sayilarin toplamini yazdiriniz
        int sum = 0;

        for (int i = 5; i < 11; i++) {
            sum += i;
        }
        System.out.println("5'den 10'a kadar toplam: " + sum);


        // 6'dan 3'e kadar olan tam sayilarin carpimini yazdiriniz
        int multiply = 1;

        for (int i = 6; i > 2; i--) {
            multiply *= i;
        }
        System.out.println("Multiply: " + multiply);


        // Kullanicidan alinan bir tam sayinin rakamlarinin toplamini yazdiriniz
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz: ");
        int num = input.nextInt();
        num = Math.abs(num);

        int sonuc = 0;

        for (int i = num; i < 0 ; i/= 10) {
            sonuc = sonuc + i % 10;
        }
        System.out.println(sonuc);









    }

}
