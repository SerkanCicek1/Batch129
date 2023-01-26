package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);

        // remove() method'u index ile kullanilirsa o index'teki elemani siler
        // remove() method'u index ile kullanilirsa size sildigi elemani verir
        String n = cities.remove(1);
        System.out.println(n); // Istanbul
        System.out.println(cities);

        // remove() method'u eleman ile kullanilirsa ilk gorunumu siler
        // remove() method'u eleman ile kullanilirsa size o elemani silip silmedigini ifade eden true veya false verir
        // Eger eleman List'te var ise o elemani siler ve size true verir
        // Eger eleman List'te yok ise o elemani siler ve size false verir
        boolean p =cities.remove("Kayseri");
        System.out.println(p); // true
        System.out.println(cities);

    }

}
