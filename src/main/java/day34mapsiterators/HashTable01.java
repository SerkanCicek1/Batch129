package day34mapsiterators;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable01 {

    public static void main(String[] args) {

        /*
         1) HashTable "thread-safe" ve "synchronized" dir
         2) HashTable entry'leri rastgele siralar
         3) HashTable'lar HashMap'lere gore daha yavastirlar
         4) HashTable'lar "key" lerde ve "value" larda "null" kullanilmasina musaade etmezler

         Note: "multi thread" ve "synchronization" kullanmaniz gerekirse ve "key" ve "value" larda "null" kullanmak
         yasak ise HashTable kullanmak gerekir
         */

        Hashtable<Integer, Integer> ht = new Hashtable<>();

        ht.put(1, 2); // 1 ve -1
        ht.put(2, 4); // 1, -1, 2, -2
        ht.put(6, 8); // 1, 2, 3, 6, -1, -2, -3, -6
        System.out.println(ht);
    }

}
