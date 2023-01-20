package slayt_sorulari;

import java.util.Scanner;

public class StringManipulations_06 {

    public static void main(String[] args) {

        // Example 1: Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir cumle ve bir harf giriniz");
        String cumle = scan.nextLine();
        char harf = scan.next().charAt(0);

        if (cumle.indexOf(harf) >= 0){
            System.out.println("Harf cumlede mevcuttur");
        } else System.out.println("Harf cumlede mevcut degildir");


        // Example 1: Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3
        //            cumleden uygun olani yaziniz
        //            - Girilen kelime cumlede kullanilmamis
        //            - Girilen kelime cumlede 1 kere kullanilmis
        //            - Girilen kelime cumlede 1'den fazla kullanilmis

        System.out.println("Lutfen bir cumle ve bir kelime giriniz");
        String cumle2 = scan.nextLine();
        String kelime = scan.next();

        // Nested If
        if (cumle2.indexOf(kelime) >= 0){

            if (cumle2.indexOf(kelime) != cumle2.lastIndexOf(kelime)){
                System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis");
            } else if (cumle2.indexOf(kelime) == cumle2.lastIndexOf(kelime)){
                System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
            } else if(cumle2.indexOf(kelime) < 0){
                System.out.println("Girilen kelime cumlede kullanilmamis");
            }

        }

        // Nested Ternay
        String  result = cumle2.indexOf(kelime) > -1 ? ((cumle2.indexOf(kelime) == cumle2.lastIndexOf(kelime)) ?
                "Girilen kelime cumlede 1 kere kullanilmis" : "Girilen kelime cumlede 1'den fazla kere kullanilmis") : "Girilen kelime cumlede kullanilmamis";










    }

}
