package day12loops;

import java.util.Scanner;

public class C03_NestedLoop {

    public static void main(String[] args) {

        /*
       Example: Asagidaki sekli cizen kodu yaziniz
                   1
                   1 2
                   1 2 3
                   1 2 3 4
                   1 2 3 4 5
        */

        for (int i = 1; i < 6; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        /*
         Example: Asagidaki sekil cizdiren kodu yaziniz
                * * * *
                * * *
                * *
                *
        */
        byte satir = 4;

        for (int i = 1; i <= satir; i++) {

            for (int j = satir; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }



        /*
         Example: Kulanicidan satir sayisini alarak asagidaki sekli yazdiriniz

               *
              * *
             *   *
            *     *
           * * * * *

         */
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen satir sayisini giriniz");
            byte row = input.nextByte();

            for (int i = 1; i <= row; i++) {
                for (int bosluk = row; bosluk >= i; bosluk--) {
                    System.out.print(" ");
                }
                for (int yildiz = 1; yildiz <= i; yildiz++) {

                    if (yildiz == 1 || yildiz == i) {
                        System.out.print("* ");
                    } else if (i == row) {
                        System.out.print("* ");
                    } else
                        System.out.print("  ");
                }
                System.out.println();

        }









    }

}
