package advanced_practice.day06;

import java.util.Scanner;

public class C02_RastgeleSifreOlusturma {

    public static void main(String[] args) {

        // Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Karakter sayisini giriniz: ");
        int karakterSayisi = input.nextInt();

        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndex = karakterler.length();
        int sayac = 0;
        String sifre = "";

        while (sayac < karakterSayisi){

            int rastgeleIndex = (int)(Math.random() * maxIndex);
            sifre += karakterler.charAt(rastgeleIndex);
            sayac++;
        }
        System.out.println("sifre = " + sifre);

    }

}
