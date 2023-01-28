package advanced_practice.day12;

import java.security.PublicKey;

public class C01_Recursive_Faktoriyel {

    public static void main(String[] args) {

        // Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)

        System.out.println(faktoriyel(5));

    }

    public static int faktoriyel(int sayi){

        if (sayi >= 0){
            if (sayi == 0 || sayi == 1){
                return 1;
            } else {
                return sayi * faktoriyel(sayi - 1);
            }
        }else {
            throw new ArithmeticException("Sayi sifirdan kucuk olamaz");
        }
    }


}
