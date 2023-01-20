package advanced_practice.day02;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Arrays_ElementSil {

    public static void main(String[] args) {
        /*
        Exmaple: Elementlerini kullanıcıdan alarak bir integer Array oluşturunuz.
                 Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Array limitini giriniz");
        int limit = input.nextInt();

        int arr[] = new int[limit];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " degerini giriniz");
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //Example: Kullanicidan bir index alip o index'deki elementi siliniz
        System.out.println("Silmek istediginiz index'i giriniz");
        int indexSil = input.nextInt();

        int arr2[] = new int[limit-1];

        int idx = 0;

        for (int i = 0; i < limit; i++) {

            if (i != indexSil){
                arr2[idx] = arr[i];
                idx++;
            }
        }




    }

}
