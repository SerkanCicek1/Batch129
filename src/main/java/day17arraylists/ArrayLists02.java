package day17arraylists;


import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {

    public static void main(String[] args) {

        // ArrayList olustururken sag tarafa(constructor) ArrayList yazmak zorundayiz
        // Fakat sol tarafa ister "ArrayList" yazin ister "List" yazin, ikisi de calisir
        ArrayList<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        // Bir List'te kac eleman oldugunu nasil anlariz ?
        int numOfElement = initials.size();
        System.out.println(numOfElement); // 4

        // Note: Array'lerden bahsederken "lengt" kullanin, List'lerden bahsederken "size" kullanin

        // Bir List'ten istenen bir eleman nasil alinir ?
        char u = initials.get(2);
        System.out.println(u); // M

        // Example: Verilen bir String List'teki tum elemanlarin toplam character sayisini bulan kodu yaziniz
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //  1. Yol
        int sum = 0;

        for (String w : cities) {
            sum += w.length();

        }
        System.out.println(sum); // 26

        //  2. Yol
        int toplam = 0;

        for (int i = 0; i < cities.size(); i++){
            toplam  += cities.get(i).length();

        }
        System.out.println(toplam); // 26


        // Bir List'teki istenen bir elemani nasil degistiririz ?
        cities.set(0, "New York");
        System.out.println(cities);

        // Example: Maas List'i olusturup %20 zam yapiniz
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);

        //  1. Yol
        int idx = 0;

       // for (Double w : salary) {
       //     salary.set(idx, w *1.2);

       //     idx++;
       // }
       // System.out.println(salary);


        //  2. Yol
        for (int i = 0; i < salary.size(); i++) {
            salary.set(i, salary.get(i) * 1.2);

        }

    }

}
