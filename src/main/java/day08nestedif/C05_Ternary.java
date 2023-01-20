package day08nestedif;

import java.util.Scanner;

public class C05_Ternary {

    public static void main(String[] args) {

        //Example: Kullanicidan bir sayi alip mutlak degerini yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = input.nextInt();

        System.out.println(sayi <= 0 ? -1 * sayi : sayi);


        //Example: Kullanicidan bir sayi aliniz pozitifse "Pozitif" negatifse "Negatif" yazdirin

        System.out.println("Lutfen bir sayi giriniz");
        int sayi2 = input.nextInt();

        System.out.println(sayi2 >= 0 ? "Pozitif" :"Negatif");


        //Example: Kullanicidan bir sayi aliniz pozitifse "Pozitif" negatifse sayinin karesini yazdirin






    }

}
