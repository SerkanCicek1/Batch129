package slayt_sorulari;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IfStatement_04 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan bir tam sayi isteyin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");
        byte num1 = scan.nextByte();

        if (num1 % 2 == 0){
            System.out.println("Sayiniz cift");
        } else System.out.println("Sayiniz tek");


        //Example 2: Kullanicidan gun isimlerinden birinin ilk harfini isteyip ve o harfle baslayan gun isimlerini yazdirin

        System.out.println("Lutfen bir gun isminin bas harfini giriniz\nOrnek: S, M, T, W, F");
        char ch1 = scan.next().toUpperCase().charAt(0);

        if (ch1 == 'S'){
            System.out.println("Sunday, Saturday");
        } else if (ch1 == 'M'){
            System.out.println("Monday");
        } else if (ch1 == 'T'){
            System.out.println("Tuesday, Thursay");
        } else if (ch1 == 'W'){
            System.out.println("Wednesday");
        } else if (ch1 == 'F'){
            System.out.println("Friday");
        } else System.out.println("Lutfen gecerli bir harf giriniz");


        //Example 3: Kullanicidan gun ismi alin ve haftaici veya haftasonu oldugunu yazdirin

        System.out.println("Lutfen bir gun giriniz");
        String gun = scan.next();

        if (gun.equalsIgnoreCase("Pazartesi")||
           gun.equalsIgnoreCase("Sali") ||
                gun.equalsIgnoreCase("Carsamba") ||
                gun.equalsIgnoreCase("Persembe") ||
                gun.equalsIgnoreCase("Cuma")){
            System.out.println("Haftaici");
        } else if (gun.equalsIgnoreCase("Cumartesi") ||
        gun.equalsIgnoreCase("Pazar")){
            System.out.println("Haftasonu");
        } else System.out.println("Lutfen gecerli bir gun giriniz");


        //Example 4: Kullanicidan dikdortgenin kenar uzunluklarini isteyip dikdortgenin kare olup olmadigini yazdirin

        System.out.println("Lutfen dikdortgenin enini giriniz");
        byte en = scan.nextByte();
        System.out.println("Lutfen dikdortgenin boyunu giriniz");
        byte boy = scan.nextByte();

        if(en == boy){
            System.out.println("Dikdortgeniniz karedir");
        } else if (en != boy){
            System.out.println("Dikdortgeniniz kare degildir");
        } else System.out.println("Lutfen gecerli bir deger giriniz");


        //Example 5: Kullanicidan bir gun alin, eger gun "Cuma" ise ekrana "Muslumanlar icin kutsal gun" yazdirin,
        //                                      eger gun "Cumartesi" ise ekrana "Yahudiler icin kutsal gun" yazdirin,
        //                                      eger gun "Pazar" ise ekrana "Hristiyanlar icin kutsal gun" yazdirin.

        System.out.println("Lutfen bir gun giriniz");
        String gun2 = scan.next();

        if(gun2.equalsIgnoreCase("Cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun2.equalsIgnoreCase("Cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun2.equalsIgnoreCase("Pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        } else System.out.println("Lutfen \"Cuma\", \"Cumartesi\" ve \"Pazar\" gunlerinden birini giriniz");


        //Example 6: Kullanicidan bir character alip girilen character'in harf olup olmadigini yazdirin

        System.out.println("Lutfen bir karakter giriniz");
        char ch2 = scan.next().charAt(0);

        if (ch2 >= 'A' && ch2 <= 'Z' || ch2 >= 'a' && ch2 <= 'z'){
            System.out.println("Karakterini bir harftir");
        } else System.out.println("Karakteriniz bir harf degildir");


        //Example 7: Kullaniciya yasini sorun eger 65'den kucuk ise "Emekli Olamazsin",
        //           eger 65'den buyuk ise "Emekli Olabilirsin" yazdirin

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = scan.nextByte();

        if (yas < 65){
            System.out.println("Emekli olamazsin");
        } else if (yas >= 65){
            System.out.println("Emekli olabilirsin");
        } else System.out.println("Lutfen gecerli bir yas giriniz");


        //Example 8: Kullanicidan 100 uzerinden bir not isteyin.Not'u harf sistemine cevirip yazdirin.50'den kucukse "D"
        //           50-60 arasi ise "C", 60-80 arasi ise "B", 80 uzeri ise "A" yazdirin

        byte not = scan.nextByte();

        if (not < 50 && not >= 0){
            System.out.println("D");
        } if (not >= 50 && not < 60){
            System.out.println("C");
        } else if (not >= 60 && not < 80){
            System.out.println("B");
        } else if (not >= 80 && not <=100){
            System.out.println("A");
        } else System.out.println("Gecerli bir not giriniz");


        //Example 9: Kullanicidan 100'den kucuk bir tam sayi isteyip 1'den baslayarak girilen sayiya kadar tum sayilari
        //           yazdirin.Ancak;
        //                          Sayi 3'un kati ise "Java" yazdirin
        //                          Sayi 5'un kati ise "Guzeldir" yazdirin
        //                          Sayi hem 3'un hem de 5'in kati isekadi ise "Java Guzeldir" yazdirin

        System.out.println("Lutfen 100'den kucuk bir sayi giriniz");
        int num = scan.nextInt();

        if (num > 0 && num < 101){
            for (int i = 1; i < num; i++){

                if(i % 3 == 0){
                    System.out.println("Java");
                } else if (i % 5 == 0){
                    System.out.println("Guzeldir");
                } else if (i % 3 == 0 && i % 5 == 0){
                    System.out.println("Java Guzeldir");
                } else System.out.println(i);
            }
        } else System.out.println("Lutfen 100'den kucuk bir sayi giriniz");


        //Example 10:


















    }

}
