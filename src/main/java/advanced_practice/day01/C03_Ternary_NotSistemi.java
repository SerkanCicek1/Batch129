package advanced_practice.day01;

import java.util.Scanner;

public class C03_Ternary_NotSistemi {

    public static void main(String[] args) {

        // Yüzlük not cinsinden kullanıcıdan alınan notu harf not sistemine çeviren bir kod yazınız.(Ternary ile)
        // 90 ve üstü A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, diğerleri F
        Scanner input = new Scanner(System.in);

        System.out.println("Notunuzu sayi cinsinden giriniz: ");
        int notSayi = input.nextInt();

        String notHarf = notSayi > 100 ?
                "Gecersiz not" : notSayi > 89 ?
                "A" : notSayi > 79 ?
                "B" : notSayi > 69 ?
                "C" : notSayi > 59 ?
                "D" : notSayi > 49 ?
                "E" : notSayi > -1 ?
                "F" : "Gecersiz not";
        System.out.println("notHarf = " + notHarf);



    }

}
