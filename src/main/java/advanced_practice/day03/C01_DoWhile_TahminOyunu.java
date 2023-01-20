package advanced_practice.day03;

import java.util.Scanner;

public class C01_DoWhile_TahminOyunu {

    public static void main(String[] args) {

        // 0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        // İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //        Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //        Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler !!! ? tahminde sayiyi buldunuz. Puaniniz: ?
        Scanner input = new Scanner(System.in);

        int rastgeleSayi = (int)(Math.random() * 101);
        int sayi;
        int sayac = 0;

        System.out.println("0-100 arasi bir sayi giriniz");

        do {
            sayac++;
            sayi = input.nextInt();
            if (sayi < rastgeleSayi){
                System.out.println((10 - sayac) + " hakkiniz kaldi");
                System.out.println("Daha büyük bir sayi giriniz");

            } else if (sayi > rastgeleSayi){
                System.out.println((10 - sayac) + " hakkiniz kaldi");
                System.out.println("Daha kucuk bir sayi giriniz");

            } else if (sayi == rastgeleSayi){
                System.out.println("Tebrikler !!! " + (sayac) + " tahminde buldunuz." +
                        " Puaniniz: " + (10 - sayac) * 10);

            }
            if (sayac == 0){
                System.out.println("Hakkiniz kalmadi");
                // Ödev: Yeniden oynama hakki
                break;
            }

        } while (rastgeleSayi != sayi);


    }

}
