package advanced_practice.day01;

import java.util.Scanner;

public class C06_WhileLoop_IlkVeSonRakam {

    public static void main(String[] args) {

        //Kullanıcıdan alınan bir sayının ilk ve son rakamlarını toplayan bir kod yazınız.
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = input.nextInt();

        int sonRakam = sayi % 10;
        System.out.println("sonRakam = " + sonRakam);

        int ilkRakam =sayi;
        while (ilkRakam > 9){
            ilkRakam /= 10;
        }
        System.out.println("ilkRakam = " + ilkRakam);

        System.out.println("Toplam: " + (ilkRakam + sonRakam));



    }

}
