package practice.daytime03ifstatement;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        //Example: Kullanicidan pozitif bir tam sayi girmesini isteyiniz
        //         girilen sayi 3 basamakli ise ekrana "3 Basamakli" yazdirin
        //         3 basamakli degilse cift olup olmadigini yazdirin

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = input.nextInt();

        //  If ile cozumu

        boolean sifirdanBuyukUcBas =   sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasOlmayanCift = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;

        if (sayi > 0){

            if (sifirdanBuyukUcBas){
                System.out.println("3 basamakli sayi");
            } else if (sifirdanBuyukUcBasOlmayanCift){
                System.out.println("3 basamakli olmayan cift sayi");
            } else System.out.println("3 basamakli olmayan tek sayi");

        } else System.out.println("Lufen pozitif bir tam sayi giriniz");


        //  Ternary ile cozumu

        boolean sifirdanBuyukUcBasTer =   sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasOlmayanCiftTer = !(sayi > 99 && sayi < 1000) && sayi % 2 == 0;

        String sonuc = sayi > 0 ? sifirdanBuyukUcBasTer ? "3 basamakli sayi" :sifirdanBuyukUcBasOlmayanCiftTer ?
                "3 basamakli olmayan cift sayi" : "3 basamakli olmayan tek sayi" :"Lutfen pozitif bir tam sayi giriniz";

        System.out.println(sonuc);









    }

}
