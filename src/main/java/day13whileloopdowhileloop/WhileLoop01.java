package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Example: Kulanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdirin
        //         3  ==>  3x1=3  3x2=6  3x3=9 ... 3x10=30
        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        double num = input.nextDouble();

        byte i = 1;

        while (i < 11) {
            System.out.println(i + " x " + num + " = " + (num * i));
            i++;
        }


        //Example: Verilen bir String'de her harfin sonrasina yildiz sembolunu ekleyiniz
        //         Java  ==>  J*a*v*a*
        System.out.println("Lutfen bir kelime giriniz");
        String word = input.next();

        String newWord = "";
        int k = 0;

        while (k < word.length()) {
            newWord += word.charAt(k) + "*";
            k++;
        }
        System.out.println(newWord);


    }

}
