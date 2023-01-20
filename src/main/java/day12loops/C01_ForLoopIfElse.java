package day12loops;

import java.util.Scanner;

public class C01_ForLoopIfElse {

    public static void main(String[] args) {


        //Example: Kullanicidan baslangic ve bitis degerini alip baslangic degerinden bitis degerine kadar olan
        //         tam sayilari ekrana yazdirin
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir baslangic ve bitis degeri giriniz: ");
        short baslangic = input.nextByte();
        short bitis = input.nextByte();


        if (baslangic > bitis) {
            System.out.println("Baslangic degeri bitis degerinden buyuk olmali");
        } else {

            for (int i = baslangic; i <= bitis; i++) {
                System.out.print(i + " ");
            }
        }


        //Example: Kullanicidan baslangic ve bitis degerini alip baslangic degerinden bitis degerine kadar aradaki
        //         cift tam sayilari yazdirin









    }

}
