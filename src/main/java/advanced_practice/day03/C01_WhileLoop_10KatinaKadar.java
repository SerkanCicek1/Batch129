package advanced_practice.day03;

import java.util.Scanner;

public class C01_WhileLoop_10KatinaKadar {

    public static void main(String[] args) {

        // Kullanıcıdan alınan bir sayıdan başlayarak ardışık sayıları 10'un katına gelene kadar yazdırınız.
        // Örn: Sayı: 46 Çıktı: 46, 47, 48, 49
        Scanner input = new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz: ");
        int sayi = input.nextInt();

        while (sayi % 10 != 0){
            System.out.print(sayi + ", ");
            sayi++;
        }

    }

}
