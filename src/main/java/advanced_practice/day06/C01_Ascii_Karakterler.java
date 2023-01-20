package advanced_practice.day06;

import java.util.Scanner;

public class C01_Ascii_Karakterler {

    public static void main(String[] args) {

        //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.
        Scanner scan = new Scanner(System.in);

        System.out.println("1. character");
        char first = scan.next().charAt(0);
        System.out.println("2. character");
        char second = scan.next().charAt(0);

        char min = (char) Math.min(first,second);
        char max = (char) Math.max(first,second);

        for (int i = min+1; i < max; i++) {
            System.out.print((char)i + " ");


        }


    }

}
