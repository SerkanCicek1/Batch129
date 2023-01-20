package advanced_practice.day05;

import day10switchloops.Switch01;

import java.util.Scanner;

public class C02_Switch_AyGunleri {

    public static void main(String[] args) {

        /*
            Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
               Girdi yıl: 2000 ay: 2
               Çıktı: 29

        Belirli bir yılın "Artık yıl" olup olmadığını kontrol etmek için kodu yazınız.
        Artık Yıl:
            1.Yıl 4 ile eşit bölünebilir ise, adım 2'e gidin. Aksi durumda, 5. adıma gidin.
            2.Yıl 100 ile eşit bölünebilir ise, adım 3'e gidin. Aksi durumda, 4. adıma gidin.
            3.Yıl 400 ile eşit bölünebilir ise, adım 4'e gidin. Aksi durumda, 5. adıma gidin.
            4.Yıl artık yıldır (366 gün vardır).
            5.Yıl artık yıl değildir (365 gün vardır).
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Yili giriniz: ");
        int yil = input.nextInt();
        System.out.println("Ay numarasi giriniz: ");
        int ay = input.nextInt();

        switch (ay){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Girdiginiz ayin gun sayisi: 31");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Girdiginiz ayin gun sayisi: 30");
                break;
            case 2:
                if (yil % 4 == 0 && yil % 100 != 0 || yil % 400 == 0){
                    System.out.println("Girdiginiz ayin gun sayisi: 30");
                } else {
                    System.out.println("Girdiginiz ayin gun sayisi: 30");
                }
                break;
            default:
                System.out.println("Gecerli bir ay numarası giriniz");
        }


    }

}
