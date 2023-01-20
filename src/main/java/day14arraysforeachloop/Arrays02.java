package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //ages[ages.length-1] arrayin son elemanini verir
        //ages.length-1 methodu arrayin length'ini verir
        //length-1 son elemanin indexini verir


        //Example: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz, bu elemanlarin en kucugu ile
        //         en buyugunun toplamini ekrana yazdiriniz
        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages)); // [20, 23, 19, 44, 15, 32]

        //  1. Yol
        // sort() method'u array'deki elemanlari kucukten buyuge dogru siralar
        //Arrays.sort(ages);
        //System.out.println(Arrays.toString(ages)); // [15, 19, 20, 23, 32, 44]

        //System.out.println(ages[0] + ages[ages.length-1]);

        //  2.Yol
        int minimum = ages[0];
        int maximum = ages[0];

        for (int w : ages){
            minimum = Math.min(minimum, w);
            maximum = Math.max(minimum, w);
        }
        System.out.println(minimum + maximum);



    }

}
