package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Example: String array olusturup, icine 5 tane eleman ekleyin, ilk eleman ile son elemanin icerdigi
        //         character sayilarinin toplamini ekrana yazdirin
        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length-1].length());  // son index icin boyle yazmamız kodu dinamik yapti


        //Example: String array olusturup, icine 5 tane eleman ekleyin, tum elemanlarin icerdigi
        //         character sayilarinin toplamini ekrana yazdirin
        String brr[] = new String[5];
        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";

        //  1.Yol for-loop
        byte totalChar = 0;

        for (int i = 0; i < brr.length; i++) {
            totalChar += brr[i].length();
        }
        System.out.println(totalChar);

        //  2.Yol for-each-loop(enhanced) ==> baslangic degeri, loop'un calisma sarti ve increment/decrement kendisi halleder
        //        for-each-loop "Array" ve "Collections" larda kullanilir
        //        index kullanmaniz gerektiginde bazen for-each-loop caresiz kalir, mecburen diger loop'lari kullaniriz
        int sum = 0;

        for (String w: brr) {
            sum += w.length();
        }
        System.out.println(sum);




    }

}
