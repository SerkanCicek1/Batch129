package practice.daytime03ifstatement;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        //Example: Kullanicidan alacaginiz 2 sayiyi, yine kullanicidan sectireceginiz dort islemden birini
        //         kullanarak sonucu dondurunuz

        Scanner input = new Scanner(System.in);

        System.out.println("Toplama yapmak icin 1, \nCikarma yapmak icin 2, \nCarpma yapmak icin 3, \nBolme yapmak icin 4 giriniz");
        byte islem = input.nextByte();

        System.out.println("Lutfen iki tam sayi giriniz");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();


        //  1.Yol
        if (islem == 1){
            System.out.println("Toplama isleminin sonucu: " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (islem ==2){
            System.out.println("Toplama isleminin sonucu: " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (islem == 3){
            System.out.println("Toplama isleminin sonucu: " + num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (islem == 4){
            System.out.println("Toplama isleminin sonucu: " + num1 + " / " + num2 + " = " + (num1 / num2));
        } else System.out.println("Lutfen gecerli bir sayi giriniz");


        //  2.Yol
        boolean first = !(islem==1 || islem==2 || islem==3 || islem==4);

        if (first){
            System.out.println("Lutfen gecerli bir numara giriniz");
        }else {
            System.out.println("Lutfen islem yapmak istediginiz 2 tamsayı giriniz...");
        }











    }

}
