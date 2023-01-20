package advanced_practice.day02;

import java.util.Scanner;

public class C02_If_Diskriminant {

    public static void main(String[] args) {

        /* Günün sorusu: Katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
         ax² + bx + c;
         Çözüm adımları
         kullanıcıdan a,b,c yi alın.
         Diskriminant formülü: (-b +/- karekök(delta)) / (2a)
         Delta = bb - 4ac
         Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
         Delta = 0 => 1 tane kök vardır x = -b/2a
         Delta < 0 ise kök yoktur.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Denklemin a, b ve c katsayilarinin sirasiyla giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta =(b*b)-(4*a*c);

        if (delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);

            System.out.println("Denklemin 2 koku vardir: x1 = " + x1 + " x2 = " + x2);
        } else if (delta == 0){
            double x = -b / (2*a);

            System.out.println("Denklemin 1 koku vardir: x = " + x);
        } else System.out.println("Denklemin koku yoktur");




    }

}
