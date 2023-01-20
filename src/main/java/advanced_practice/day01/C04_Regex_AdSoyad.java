package advanced_practice.day01;

import java.util.Scanner;

public class C04_Regex_AdSoyad {

    public static void main(String[] args) {

       /*
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       Ad: Ali
       Soyad: Can
       */
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ad ve soyadinizi giriniz");
        String adSoyad = input.nextLine().replaceAll("[^a-zA-Z ]", "").
                replaceAll("\\s+"," ").trim().toLowerCase();

        String ad = adSoyad.split(" ")[0];
        String soyad = adSoyad.split(" ")[1];

        String adIlkHarf = ad.substring(0,1).toUpperCase();
        String soyadIlkHarf = ad.substring(0,1).toUpperCase();

        String adFormat = adIlkHarf + ad.substring(1);
        String soyadFormat = soyadIlkHarf + ad.substring(1);

        System.out.println("Ad: " + adFormat + "\nSoyad: " + soyadFormat);


    }

}
