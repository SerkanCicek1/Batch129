package advanced_practice.day07;

import java.util.Scanner;

public class C02_TasKagitMakas {

    public static void main(String[] args) {

        /*
        Taş-Kağıt-Makas oyunu yazınız:
          -Oyuncudan tahmin alınız.
          -Bilgisayarın tahmini ile karşılaştırınız.
               -3'e ilk ulaşan kazanır
               -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.
         */
        Scanner input = new Scanner(System.in);
        int oyuncuKazanmaSayisi = 0;
        int bilgisayarKazanmaSayisi = 0;
        int sayac = 0;

        while (oyuncuKazanmaSayisi < 3 && bilgisayarKazanmaSayisi < 3){
            sayac++;
            System.out.println("Secim yap: \nTas \nKagit \nMakas");
            String oyuncuTahmini = input.next().toLowerCase();

            if (!(oyuncuTahmini.equals("tas") || oyuncuTahmini.equals("kagit") || oyuncuTahmini.equals("makas"))){
                System.out.println("Gecerli bir tahmin giriniz \n");
                sayac--;
                continue;

            }

            String[] arr = {"Tas", "Kagit", "Makas"};
            String bilgisayarTahmini = arr[(int)Math.random() * 3].toLowerCase();

            if (oyuncuTahmini.equals(bilgisayarTahmini)){
                System.out.println("Berabere! Skor: " + oyuncuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);

            } else if (oyuncuTahmini.equals("tas") && bilgisayarTahmini.equals("makas") || oyuncuTahmini.equals("kagit") &&
                    bilgisayarTahmini.equals("tas") || oyuncuTahmini.equals("makas") && bilgisayarTahmini.equals("kagit")){
                oyuncuKazanmaSayisi++;
                System.out.println("Kazandınız! Skor: " + oyuncuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);

            } else {
                bilgisayarKazanmaSayisi++;
                System.out.println("Kaybettiniz! Skor: " + oyuncuKazanmaSayisi + "--" + bilgisayarKazanmaSayisi);
            }
        }
        System.out.println("===GAME OVER===");

        String skor;

        if (oyuncuKazanmaSayisi ==3 ){

            if (bilgisayarKazanmaSayisi == 0){
                skor = "Altın";
            } else if (bilgisayarKazanmaSayisi == 1){
                skor = "Gumus";
            } else {
                skor = "Bronz";
            }
            System.out.println(skor + " skor ile kazandınız");
        } else {

            if (oyuncuKazanmaSayisi == 0){
                skor = "Altın";
            } else if (oyuncuKazanmaSayisi == 1){
                skor = "Gumus";
            } else {
                skor = "Bronz";
            }
            System.out.println("Bilgisayar " + skor + " skor ile kazandı.");
        }


    }

}
