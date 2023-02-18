package slayt_sorulari.discord_calisma;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {

        //Example: Kullanicidan gun ismini yazmasini isteyin, girilen gun gecerli ise gunun 1., 2. ve 3. harflerini alıp
        //         ilk harfi buyuk, diger ikisini kucuk olarak yazdırın.Gun ismi gecerli degil ise

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        String gun = scan.next();

        if(gun.equalsIgnoreCase("Pazartesi") ||
        gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma") ||
                gun.equalsIgnoreCase("Cumartesi") ||
                gun.equalsIgnoreCase("Pazar")){

            char gunHarf1 = gun.toUpperCase().charAt(0);
            char gunHarf2 = gun.toLowerCase().charAt(1);
            char gunHarf3 = gun.toLowerCase().charAt(2);

            System.out.println("1. Harf: " + gunHarf1 + "\n2. Harf: " + gunHarf2 + "\n3. Harf: " + gunHarf3);
        } else System.out.println("Lutfen gecerli bir gun giriniz");

        //Example: Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        //         sayilarin ikisi de negatif ise sayilarin carpimini yazdirin,
        //         sayilarin ikisi farkli farkli isaretlere sahipse "Farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        //         sayilardan sifira esit olan varsa "Sifir carpmaya gore yutan elemandir" yazdirin

        System.out.println("Lutfen bir iki tane sayi giriniz");
        byte num1 = scan.nextByte();
        byte num2 = scan.nextByte();

        if (num1 > 0 && num2 > 0){
            System.out.println("Sayilarin toplami: " + (num1 + num2));
        } else if (num1 < 0 && num2 < 0){
            System.out.println("Sayilarin carpimi: " + (num1 * num2));
        } else if (num1 * num2 < 0){
            System.out.println("Farkli isaretlerde sayilarla islem yapamazsin");
        }else if (num1 * num2 == 0){
            System.out.println("Sifir carmpaya gore yutan elemandir");
        }




    }

}
