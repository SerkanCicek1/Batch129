package day03scanner;

import java.util.Scanner;

public class C02_Scanner{

    //Scanner classi kullanici ile etkilesim kurmamizi saglar
    //Scanner bir Class'dir.Java util kutuphanesinden getirildigi icin import ister

    public static void main(String[] args) {

        //Kullanicidan Data Almak Icin;

        //1.Adim Scanner Class'indan Object olusturun
        Scanner input = new Scanner(System.in);

        //2.Adim Kullaniciya ne yapacagini soyle
        System.out.println("Lutfen yasinizi giriniz");

        //3.Adim Kullanicidan aldiginiz datayi variable icine koyun
        byte age= input.nextByte();


        //Ornek: Kullaniciya ad, memleket, yas, boy ve yasadigi yeri sevip sevmedigini soran kodu yaziniz
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim= scan.nextLine(); //String deger icin eger tum satiri istiyorsak "nextLine" sadece ilk kelimeyse "next"

        System.out.println("Lutfen memleketinizi giriniz...");
        String memleket= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz....");
        int yas =scan.nextInt();

        System.out.println("Lutfen boyunuzu giriniz....");
        short boy= scan.nextShort();

        System.out.println("Lutfen yasadiginiz yeri sevip sevmediginizi yaziniz");
        boolean seviyorMu = scan.nextBoolean();


        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);


    }

}
