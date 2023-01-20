package advanced_practice.day07;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays_OrtaElement {

    public static void main(String[] args) {

    /*
       Elementlerini kullanıcandan aldığınız bir integer array içindeki orta elementi bulan bir kod yazınız.
       Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz");
        int[] arr = new int[input.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". elementi giriniz");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ortaIdx = arr.length / 2;

        if (arr.length % 2 != 0) {

            System.out.println("Orta element: " + arr[ortaIdx]);

        } else {
            System.out.println("Orta element: " + (arr[ortaIdx] + arr[ortaIdx - 1]) / 2.0);
        }


    }

}
