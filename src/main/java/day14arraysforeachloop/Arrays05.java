package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        // Note: sort() method'u sayisal data type'larini kucukten buyuge siralar(ascending order)
        //                       String type'larini alfabetik olarak siralar(alphabetical order)
        //                       Array elemanlarini "Natural Order" a gore sialar
        // alphabetical order + ascending order ==> Natural Order

        // binarySearch() method'u bir elemanin bir array'de olup olmadigini kontrol eder
        // binarySearch() method'unu kullanmadan once sort() method'unu kullanmak zorundayiz

        String[] colors = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors)); // [Blue, Brown, Green, Orange, Red, Yellow]

        int num1 = Arrays.binarySearch(colors, "Blue");
        System.out.println(num1); // 0 ==> var hem de indexi sifir

        int num2 = Arrays.binarySearch(colors, "Orange");
        System.out.println(num2); // 3 ==> var hem de indexi üc

        int num3 = Arrays.binarySearch(colors, "Messi");
        System.out.println(num3); // -6 ==> "-" bu eleman yok demek
                                  //         "6" ise olsaydi 6. eleman olurdu demek




    }

}
