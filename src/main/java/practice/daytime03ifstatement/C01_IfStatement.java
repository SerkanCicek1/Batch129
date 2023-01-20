package practice.daytime03ifstatement;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        //Example 5: Kullanicidan bir gun alin, eger gun "Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdirin,
        //                                      eger gun "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin,
        //                                      eger gun "Pazar" ise ekrana "Hristiyanlar icin kutsal gun" yazdirin.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir gun ismi giriniz");
        String gun = input.next().toLowerCase();

        if (gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        } else System.out.println("Kutsal gun degil");






    }

}
