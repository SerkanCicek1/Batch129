package day08nestedif;

import java.util.Scanner;

public class C04_Ternary {

    public static void main(String[] args) {

        //Example: Kullanicidan iki sayi alip kucuk olan sayiyi yazdiriniz


        //  1.Yol
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        if(sayi1 < sayi2){
            System.out.println("Kucuk Olan Sayi: " + sayi1);
        } else if (sayi1 > sayi2){
            System.out.println("Kucuk Olan Sayi: " + sayi2);
        } else System.out.println("Sayilar Birbirine Esit");


        //  2.Yol  Ternary Operator
        //                      condition      if          Code1          else          Code2
        //                     burası true     ise        bunu yap       degilse       bunu yap
        //System.out.println(     x > y         ?      "X daha buyuk"       :       "Y daha buyuk"          );

          System.out.println(sayi1 == sayi2     ?     "Sayilar Esit"      :      sayi1 > sayi2 ? sayi2 : sayi1);
















    }

}
