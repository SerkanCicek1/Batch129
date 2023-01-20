package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir tam sayi aliniz, sayi 100'den kucuk ise kullaniciya "Kaybettiniz!" yazdirin
                                        , sayi 100 ve 100'den buyuk ise kullaniciya "Kazandiniz!" yazdirin

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz: ");

        short num = 0;

        do{
            System.out.println("Lutfen bir tam sayi giriniz: ");
            num = input.nextShort();

            if(num >= 100){
                System.out.println("Kazandiniz!");
            }

        } while (num < 100);
        System.out.println("Kaybettiniz!");

          // scope== curly braces icinde kullanilan degerler body'nin disinda kullanilinca hata verir
          // dolayisiyla do'nun body'sinddeki num bodynin disinkdaki while disinda hata verir



    }

}
