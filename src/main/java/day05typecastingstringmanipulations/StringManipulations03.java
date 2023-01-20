package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
        Example: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz
                 1)En az 8 character olsun
                 2)Space character'i olmasın
                 3)En az bir tane buyuk harf olsun
                 4)En az bir tane kucuk harf olsun
                 5)En az bir tane sembol olsun
                 6)En az bir tane rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();

        //1)En az 8 character olsun
        boolean first = pwd.length() > 7;

        //2)Space character'i olmasın
        boolean second = !pwd.contains(" ");

        //3)En az bir tane buyuk harf olsun
        //Note: Buyuk harf olmayanlari sil, kalan character sayisina bak, character sayisi  = 0 ise buyuk harf yok
        //                                                                character sayisi  > 0 ise buyuk harf var
        boolean third = pwd.replaceAll("[^A-Z]", "").length() > 0; //Method'lari ayni satirda yanyana kullanmaya "Method Chain" denir

        //4)En az bir tane kucuk harf olsun
        boolean fouth = pwd.replaceAll("[^a-z]", "").length() > 0;

        //5)En az bir tane sembol olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]", "").length() > 0;

        //6)En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]","").length() > 0;


        System.out.println("Password gecerli mi ? " + (first && second && third && fouth && fifth && sixth));

    }

}
