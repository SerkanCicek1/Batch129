package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulationsHomework {

    public static void main(String[] args) {

        // Soru 1:  Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle = scan.nextLine();

        System.out.println("Lutfen bir harf giriniz: ");
        char harf = scan.next().charAt(0);

        if (cumle.indexOf(harf) == -1){
            System.out.println("Bu harf cumle icinde mevcut degil !");
        }
        else {
            System.out.println("Bu harf cumle icinde mevcut !");
        }










    }

}
