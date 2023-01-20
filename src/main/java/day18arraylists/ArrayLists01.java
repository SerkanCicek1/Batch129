package day18arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        // ArrayList nasil olusturulur ?
        List<Integer> nums = new ArrayList<Integer>();

        // ArrayList nasil yazdirilir ?
        System.out.println(nums); // []

        nums.add(37);
        nums.add(38);
        nums.add(39);
        nums.add(40);
        nums.add(41);
        nums.add(42);
        System.out.println("nums = " + nums); // [37, 38, 39, 40, 41, 42]

        // ArrayList'in bos olup olmadigini nasil anlariz ?
        boolean bosmu1 = nums.isEmpty();
        System.out.println("bosmu1 = " + bosmu1); // false

        List<Integer> ages = new ArrayList<Integer>();
        boolean bosmu2 = ages.isEmpty();
        System.out.println("bosmu2 = " + bosmu2); // true

        // Example: nums ArrayList'indeki tum tek sayilari 11 arttirip ekrana yazdiriniz.

        for (int w : nums) {
            if (w % 2 != 0){
                nums.set(nums.indexOf(w), w + 11);
            }
        }
        System.out.println("nums = " + nums); // [48, 38, 50, 40, 52, 42]


        nums.add(52);
        nums.add(36);
        nums.add(52);

        // List'lerden eleman nasil silinir ?

        // Example: nums ArrayList'inden 52 rakaminin gorunumunu siliniz
        System.out.println("nums = " + nums); // [48, 38, 50, 40, 52, 42, 52, 36, 52]

        // nums.remove(52);
        System.out.println("nums = " + nums);

        /*
        remove() methodunun icine tam sayi yazarsaniz
        Java bunu index kabul eder.Silinecek eleman olarak algilamaz.
        Tum tam sayilar aksi belirtilmedikce primitive int 'dir.
        Primitive Data Type'lari da ArrayList'lerin elemani olamazlar.
        Primitive Data Type'larini Wrapper class'a cevirmeliyiz
         */
        Integer sayi = 52;
        nums.remove(sayi);
        System.out.println("nums = " + nums);



        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println("names = " + names);

        List<String> emekliOlacaklar = new ArrayList<>();
        emekliOlacaklar.add("Thomas");
        emekliOlacaklar.add("Tahsin");
        emekliOlacaklar.add("Trump");

        names.removeAll(emekliOlacaklar);

        System.out.println("emekliOlacaklar = " + emekliOlacaklar);
        System.out.println("names = " + names);



        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        System.out.println("a = " + a);

        a.remove("Shoes");
        System.out.println("a = " + a);


        // Array Listimizde coklu datanin olup olmadigini nasil gosteririz ?
        // containsAll() bir list icinde coklu elemanin olup olmadigini kontrol eder.
        //               hepsi varsa true; en az bir tanesi yoksa false verir

        List<String> myNames= new ArrayList<>();
        myNames.add("Burcu");
        myNames.add("Can");
        myNames.add("Zisan");
        myNames.add("Emre");
        myNames.add("Bilal");
        myNames.add("Gul");

        System.out.println("myNames = " + myNames); //myNames = [Burcu, Can, Zisan, Emre, Bilal, Gul]

        List<String> varMi= new ArrayList<>();
        varMi.add("Burcu");
        varMi.add("Ebubekir");
        varMi.add("Can");

        System.out.println("varMi = " + varMi);
        boolean sonuc =myNames.containsAll(varMi);
        System.out.println("sonuc = " + sonuc);

















    }

}
