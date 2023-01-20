package slayt_sorulari.discord_calisma;

import java.util.Scanner;

public class C02 {

    /*
    Bir sayı, her basamağının küpünün toplamına eşitse Armstrong sayısı olarak adlandırılır. Örneğin, 153,
    her basamağın küpüne eşit olan 153 = 1 + 125 + 27 olduğundan bir Armstrong sayısıdır.
    Verilen numaranın Armstrong sayısı olup olmadığını kontrol etmek için bir kod yazınız.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int num = scan.nextInt();

        int birlerBas = num % 10;
        int onlarBas = (num / 10) % 10;
        int yuzlerBas = num / 100;

        int birlerBasKup = birlerBas * birlerBas * birlerBas;
        int onlarBasKup = onlarBas * onlarBas * onlarBas;
        int yuzlerBasKup = yuzlerBas * yuzlerBas * yuzlerBas;

        if (birlerBasKup + onlarBasKup + yuzlerBasKup == num ){
            System.out.println("Armstrong sayıdır");
        } else if (!(birlerBasKup + onlarBasKup + yuzlerBasKup == num)) {
            System.out.println("Armstrong sayı degildir");
        } else System.out.println("Hatalı giriş");

    }

}
