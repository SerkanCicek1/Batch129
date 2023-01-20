package day10switchloops;

public class Loops01 {

    public static void main(String[] args) {

        /*
         Code Standarts:
           a) Tekrar (Repetition) olmamalidir
           b) Dynamic olmalidir
           c) Fix ve update kolay yapilmalidir
        */

        // Example: Ekrana 5 kere "Hi" yazdiriniz

        //  1.Yol: Tavsiye Edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");


        //  2.Yol: Loops
        // Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kullanilir
        // Dort tane loop var; a)for-loop   b)while-loop   c)do-while-loop   d)for-each-loop

        //  for-loop
        //     baslangic degeri   loop'un calisma sarti  Increment/Decrement
        for  (    int i = 1    ;        i < 6          ;         i++        ) {
            System.out.println("Hi!");
        }

        // Example: 11'den 44'e kadar tum tam sayilari ekrana yazdirin
        for (int i = 11; i < 45; i++) {
            System.out.println(i);
        }

        // Example: 40'dan 23'e kadar tum cift tam sayilari ekrana yazdirin
        for (int i = 40; i > 22; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Example: 18'den 56'ya kadar tum tek tam sayilari ekrana yazdirin
        for (int i = 18; i < 57; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }









    }

}
