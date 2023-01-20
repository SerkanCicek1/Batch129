package day08nestedif;

import java.util.Scanner;

public class C01_NestedIf {

    public static void main(String[] args) {

        /*
        Task: -Kullanicidan uc tane pozitif tam sayi aliniz
              -Bu uc sayinin ucgen olusturma durumunu kontrol ediniz
              -Eger ucgen ise "eskenar ucgen" olma durumunu kontrol ediniz

        Info:
        Ucgen olma sarti: herhangi iki kenar toplami ucuncu kenardan buyuk olmali
                          herhangi iki kenar farki ucuncu kenardan kucuk olmali

                          a+b > c > a-b
                          a+c > b > a-c
                          b+c > a > b-c
                          a = b = c   ise eskenar ucgen

         Java nested kodlari

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin uc kenar uzunlugunu giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && a - b < c && a + c > b && a - c < b && b + c > a && b - c < a) {

            if (a == b && b == c && a == c) {
                System.out.println("Eskenar Ucgen");
            } else {
                System.out.println("Eskenar Ucgen degildir");
            }

        } else {
            System.out.println("Ucgen degildir");
        }


        //Example: -Kullanicidan bir ucgenin kenar uzunlugunu aliniz
        //         -Uc kenari birbirine esit ise "Eskenar Ucgen" yazdiriniz
        //         -İki kenari birbirine esit ise "İkinkenar Ucgen" yazdiriniz
        //         -Tum kenarlari farkli ise "Cesit Kenar Ucgen" yazdiriniz

        System.out.println("Lutfen ucgenin uc kenar uzunlugunu giriniz");
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();

        if (d + e > f && d - e < f && d + f > e && d - f < e && e + f > d && e - f < d) {

            if (d == e && e == f && d == f) {
                System.out.println("Eskenar Ucgen");
            } else if (d == e || e == f || d == f) {
                System.out.println("Ikizkenar Ucgen");
            } else {
                System.out.println("Cesitkenar Ucgen");
            }

        } else {
            System.out.println("Lutfen gecerli bir ucgen giriniz");
        }


    }

}
