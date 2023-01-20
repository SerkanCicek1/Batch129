package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {

    public static void main(String[] args) {

        // Bir ogretmenin okulundaki ogrencilerin isimlerini applicationa yukleyelemesini saglayan kodu yaziniz
        Scanner input = new Scanner(System.in);

        System.out.println("Kac ogrenci ismi gireceksiniz");
        int numofStd = input.nextInt();

        String names[] = new String[numofStd];

        System.out.println("Cıkmak icin Q harfine basiniz");

        for (int i = 1; i <= numofStd ; i++) {
            System.out.println("Lutfen" + i + ". ogrencinin numarasini giriniz");
            String stdNames = input.next();
            if (stdNames.equalsIgnoreCase("Q")){  // burası tum isimleri birden girmek istemezsek diye çıkış için
                break;
            }
            names[i-1] = stdNames;
        }
        System.out.println(Arrays.toString(names));


    }

}
