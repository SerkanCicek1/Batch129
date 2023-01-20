package advanced_practice.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_List_OrtalamaUstuOgrenciler {

    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.

        Scanner input = new Scanner(System.in);

        List<Integer> notlar = new ArrayList<>();

        int sayac = 0;
        String karar;

        do {
            sayac++;
            System.out.println(sayac + ". notu giriniz");
            notlar.add(input.nextInt());

            System.out.println("Daha fazla not girmek icin E, cıkmak icin H giriniz");
            karar = input.next();
        }while (!karar.equalsIgnoreCase("H"));

        int toplam = 0;

        for (Integer w : notlar) {
            toplam += w;
        }
        int ortalama = toplam / notlar.size();
        System.out.println("ortalama = " + ortalama);

        int ortalamaUstuNotSayisi = 0;

        for (Integer w : notlar) {
            if (w > ortalama){
                ortalamaUstuNotSayisi++;
            }
        }

        System.out.println("ortalamaUstuNotSayisi = " + ortalamaUstuNotSayisi);




    }

}
