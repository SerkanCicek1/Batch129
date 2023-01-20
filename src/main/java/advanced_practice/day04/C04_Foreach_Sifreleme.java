package advanced_practice.day04;

import java.util.Scanner;

public class C04_Foreach_Sifreleme {

    public static void main(String[] args) {

      // Example: Kullanıcıdan alınan bir String'de bulunan her bir karakteri alfabetik sırada bir sonraki karakter ile
      //          değiştirerek şifreleyen bir method ve şifreli ismi çözen ayrı bir method yazınız.

        System.out.println(sifreleme());

        System.out.println(sifreCoz());

    }

    public static String sifreleme(){
        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz");

        String[] arr = input.nextLine().split("");
        String sifreliString = "";

        for (String w : arr) {
            if (w.equals("z")){
                sifreliString += "a";

            } else if (w.equals("Z")){
                sifreliString += "A";

            } else {
                sifreliString += sifreliString += (char)(w.charAt(0) + 1);
            }
        }
        return sifreliString;
    }

    public static String sifreCoz(){
        Scanner input = new Scanner(System.in);
        System.out.println("Sifreli String'i giriniz");

        String[] arr = input.nextLine().split("");
        String sifresizString = "";

        for (String w : arr) {
            if (w.equals("a")){
                sifresizString += "z";

            } else if (w.equals("A")){
                sifresizString += "Z";

            } else {
                sifresizString += sifresizString += (char)(w.charAt(0) - 1);
            }
        }
        return sifresizString;
    }

    // Normal for loop ile ==> odev

}
