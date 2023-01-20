package day10switchloops;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        // Example: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12. aya kadar
        //          tum aylarin isimlerini yazdirin
        //          8  ==>  Autgust - September -October - Novermber - December
        Scanner input = new Scanner(System.in);

        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){

            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Gecerli bir ay numarasi giriniz");
        }

        // Note: "switch" de String, int, byte, short, char kullanilabilir
        // Note: "switch" de long, boolean, float, double kullanilamaz











    }

}
