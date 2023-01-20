package day16multidimensionalarrays;

import java.util.Arrays;

public class C02_MultidimensionalArrays {

    public static void main(String[] args) {

        //Bir tane integer multidimensional array olustup tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = {{2, 5, 1}, {32, 75}};
        int sum = 0;

        for (int[] w : arr) {
            for (int k : w) { // k artik array degil array icindeki integer deger
                sum+=k;
            }
        }
        System.out.println(sum);

        // Multidimensionel Array'i tek katli Array'e cevirme

        /*
        1) Multidimensional array'in eleman sayisini bulunuz
        2) Yeni bir array olusturunuz, bu array'in buyuklugu; ilk multidimensional
         */

        int brr[][] = {{ 2, 5, 1}, {32,75}};
        int toplam = 0;

        for (int[] w : brr) {
            toplam += w.length;
        }
        System.out.println(toplam);

        int idx = 0;
        int crr[] = new int[toplam];

        for (int w : crr) {

            for (int k : crr) {
                crr[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));



    }

}
