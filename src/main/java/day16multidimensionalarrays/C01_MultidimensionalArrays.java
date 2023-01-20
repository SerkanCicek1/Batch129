package day16multidimensionalarrays;

import java.util.Arrays;

public class C01_MultidimensionalArrays {

    public static void main(String[] args) {


        // Bir Array'in icindeki data yine bir Array ise buna "multidimensional Array" denir

        // Multidimensional Array nasil olusturulur
        int arr[][] = new int[3][2]; // auter array ==> 3

        // inner array = 2 olan bir multidinemsional array olusturduk
        // Bu yontemle inner arrayler sabit olmak zorunda
        System.out.println(Arrays.toString(arr)); // [[I@49e4cb85, [I@2133c8f8, [I@43a25848] ic ice oldugu icin ic array referanslari gozuktu

        System.out.println(Arrays.toString(arr[1])); // [0, 0]
        System.out.println(Arrays.deepToString(arr)); // Multidimensional array bu sekilde yazdirilir  [[0, 0], [0, 0], [0, 0]]

        // Arraylere eleman eklemenin 2. Yontemi: hem declare hem deger atama
        int arr2[][] = {{2,3}, {9}, {78,6,4,5}};
        System.out.println("Hem declare hem de deger atamsi ile " + Arrays.deepToString(arr2));
        System.out.println("Hem declare hem de deger atamsi ile " + Arrays.toString(arr2[1])); // [9]

        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][0] = 6;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        System.out.println(Arrays.deepToString(arr)); // [[3, -4], [6, 18], [-7, 0]]
        System.out.println(Arrays.toString(arr[1])); // [6, 18]
        System.out.println(arr[1][0]); // 6

        // Example: String bir multidimensional Array olusturun, icerisine datalari ekleyip toplam eleman sayisini yazdirin
        String brr[][] = new String[3][2];
        brr[0][0] ="a"; //kat 1 daire 1
        brr[0][1] ="b"; //kat 1 daire 2

        brr[1][0] ="c"; //kat 2 daire 1
        brr[1][1] ="d"; //kat 2 daire 2

        brr[2][0] ="e"; //kat 3 daire 1
        brr[2][1] ="f"; //kat 3 daire 2
        System.out.println(Arrays.deepToString(brr));

        int sum = 0;

        for (String[] w : brr){ // w == each (her bir)
            sum += w.length;
        }
        System.out.println(sum);


    }

}
