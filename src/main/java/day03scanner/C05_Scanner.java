package day03scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        //Ornek: Bir diktortgenin en ve boyunu alıp, alanını ve cevresini hesaplayan kodu yaziniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen en uzunlugunu giriniz: ");
        int en = scan.nextInt();

        System.out.println("Lutfen boy uzunlugunu giriniz: ");
        int boy = scan.nextInt();

        System.out.println("Diktortgenin alanı: " + (boy * en));
        System.out.println("Diktortgenin cevresi: " + 2 * (boy + en));



    }

}
