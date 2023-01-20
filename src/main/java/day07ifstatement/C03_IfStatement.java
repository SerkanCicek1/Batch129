package day07ifstatement;

import java.util.Scanner;

public class C03_IfStatement {

    public static void main(String[] args) {

        /*
        Iki String data'nin birbirine esit olup olmadigini anlamak icin "==" degil equals() kullaniriz
        a) equals() ==> Buyuk kucuk harf onemser
        b) equalsIgnoreCase() ==> Buyuk kucuk harf onemsemez
        */

        //Kullanicidan gun isimlerini aliniz ve harfaici mi haftasonu mu oldugunu yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        String gun = input.next();


        // 1. YOL:

        if (gun.equalsIgnoreCase("Cumartesi") || gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Haftasonu");
        } else if (gun.equalsIgnoreCase("Pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")) {
            System.out.println("Hafta ici");
        } else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }


        // 2. YOL:

        boolean haftaici = gun.equalsIgnoreCase("pazartesi") ||
                gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma");

        boolean haftasonu = gun.equalsIgnoreCase("Cumartesi") ||
                gun.equalsIgnoreCase("Pazar");

        if(haftaici){
            System.out.println("Hafta ici");
        }else if(haftasonu){
            System.out.println("Hafta sonu");
        }else{
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }





    }

}
