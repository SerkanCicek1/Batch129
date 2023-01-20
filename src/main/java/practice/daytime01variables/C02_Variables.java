package practice.daytime01variables;

import java.util.Scanner;

public class C02_Variables {

    public static void main(String[] args) {

                /*
          TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy,
          salona devam edeceği ay süresi
          bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz:");
        String isimSoyisim = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz:");
        int yas = scan.nextInt();

        System.out.println("Lütfen kilonuzu giriniz:");
        double kilo = scan.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz:");
        double boy = scan.nextDouble();

        System.out.println("Lütfen spora kaç ay devam etmek istediğinizi giriniz:");
        int devamEdilcekAy = scan.nextInt();


        System.out.println("Isim Soyisim: " + isimSoyisim + "\n" + "Yas: " + yas + "\n" + "Kilo: " + kilo + "\n" + "Boy: " + boy);
        System.out.println("Salona gelinecek sure: " + devamEdilcekAy + "\n" + "Toplam ucret: " + "$" + 20 * devamEdilcekAy);

    }

}
