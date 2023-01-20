package day17arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayLists01 {

    public static void main(String[] args) {

        /*
        1) ArrayList (List)'ler coklu data depolamak icin kullanilir
        2) ArrayList (List)'ler non-primitive data type'indaki coklu datalari depolamak icin kullanilir
           List'ler "non-primitive" data kabul ederken, Array'ler "primitive" veya reference kabul eder
        3) ArrayList (List)'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur
           List'ler eleman sayisinda "flexible" dirlar ama "Array"ler degildir
        4) Eleman sayisi belli olan data'lari depolamak icin Array tercik edilir cunku hizlidir ve daha az yer kaplar
         */

        // List nasil olusturulur ?
        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages); // []

        // List'lere eleman nasil eklenir ?
        // List'e eleman eklemek icin add() method'unu kullaniriz
        // add() method'u elemanlari sizin verdiginiz sira ile "list" in en sonuna ekler (Insertion Order)
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(1,26); // bu sekilde index belirterek de istedigimiz yere eleman ekleyebiliriz
        System.out.println(); // [12, 26, 9, 10]

        // List'e coklu eleman nasil ekleriz veya List'e baska bir List nasil eklenir ?
        // Bir "List" e coklu eleman eklemek, o elemanlari once bir List'in icine koymalisiniz
        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2,newAges);
        System.out.println(ages); // [12, 26, 8, 9, 10, 9, 10, 8, 9, 10]

        // ages.clear(); // tum datayi siler
        // System.out.println(ages); // []

        // contains() method'u bir elemanin List'de var olup olmadigini kontrol eder
        boolean r = ages.contains(26);
        System.out.println(r);

        // Bir List'in baska bir list ile ayni olup olmadigini nasil kontrol ederiz ?
        // Iki List'in esit olmasi icin ayni index'de ayni elemanlar olmalidir

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s); // false

        // Example: Verilen iki Integer List'te tamamiyla ayni elemanlarin olup olmadigini kontrol ediniz
        ArrayList<Integer>nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer>nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);
        boolean t = nums1.equals(nums2);
        System.out.println(t);//true










    }

}
