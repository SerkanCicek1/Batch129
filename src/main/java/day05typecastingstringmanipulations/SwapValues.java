package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: Yer degistirmek.

    public static void main(String[] args) {

        int a = 12;
        int b = 5;  // Swap'den sonra ==> a = 5 , b = 12
        int temp = 0;

        System.out.println("a: " + a); // 12
        System.out.println("b: " + b); // 5

        //    1.Yol    //

        // 1. Adim
        temp = a;

        // 2.Adim
        a = b;

        // 3.Adim
        b = temp;

        System.out.println("a: " + a); // 5
        System.out.println("b: " + b); // 12

        //    2.Yol    //   Interview'lerde istenen cevap budur

        int x = 12;
        int y = 5;

        // 1. Adim
        x = x + y;

        // 2. Adim
        y = x - y;

        // 3. Adim
        x = x - y;




    }

}
