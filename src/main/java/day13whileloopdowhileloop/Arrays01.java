package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int a = 12; // bu yapinin icinde sadece bir tane data depolanabilir
                    //Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyacı hissederiz.
                    // Bir yapinin icinde coklu data depolayabilme icin Java "Array" yapisini olusturmustur.

        // Arrya nasil olusturulur ?
        // Array olusturmak icin Array elemanlarinin "data type" i ve "eleman sayisi" mutlaka yazilmalidir
        String stdNames [] = new String[5];

        // Array console'a nasil yazdirilir ?
        // toString() method'unu kullanmadan sadece array ismi ile yazdirirsaniz, Java o Array'in adresini yazdirir
        System.out.println(Arrays.toString(stdNames)); // [null, null, null, null, null]

        // Array'e eleman ekleme nasil yapilir ?
        stdNames[2] = "Neymar";
        System.out.println(Arrays.toString(stdNames)); // [null, null, Neymar, null, null]

        stdNames[0] = "Messi";
        stdNames[1] = "Ronaldo";
        stdNames[3] = "Benzema";
        stdNames[4] = "Ronaldinho";
        System.out.println(Arrays.toString(stdNames));

        // Array'den specific bir eleman nasil alinir ?
        System.out.println(stdNames[2]);


        // Example: Array'deki her elemani sonuna "!" isareti koyarak yazdirin
        for (int i = 0; i < stdNames.length; i++) {
            System.out.println(stdNames[i] + "!");
        }




    }

}
