package advanced_practice.day09;

import java.util.Scanner;

public class C03_ForLoop_RakamlarToplami {

    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz: ");
        String str = input.nextLine();

        System.out.println(rakamlarToplami(str));

    }

    static double rakamlarToplami(String str){
        int toplam = 0;

        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                toplam += Integer.valueOf("" +str.charAt(i));
            }
        }
        System.out.println("toplam = " + toplam);

        return toplam;

    }


}
