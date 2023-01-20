package day03scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {


        //Ornek: Kullanicidan aldiginiz sekil ile asagidaki gibi bir gorsel olusturunuz

        /*
              A
             A A
            A A A
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sekil giriniz: ");
        char sekil = scan.next().charAt(0);

        // System.out.println(" " + " " + sekil);
        // System.out.println(" " + sekil + " " + sekil);
        // System.out.println(sekil + " " + sekil + " " + sekil);

        System.out.println("\t\t" + sekil);
        System.out.println("\t" + sekil + "\t\t" + sekil);
        System.out.println(sekil + "\t\t" + sekil + "\t\t" + sekil);


        //  \n ==> alt satira atar
        //  \t ==> bir tab bosluk birakir
        //  \b ==> gerisindeki bir harfi siler
        //  ctrl + z ==> geri alır
        //  ctrl + alt + l ==> sayfayi duzenler


    }

}
