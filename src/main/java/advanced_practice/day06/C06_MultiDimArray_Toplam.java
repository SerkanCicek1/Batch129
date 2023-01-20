package advanced_practice.day06;

import java.util.Arrays;

public class C06_MultiDimArray_Toplam {

    public static void main(String[] args) {

     /*
     Example: Multi dimensional arrayin ic arraylerindeki tum elemanlarin toplamini birer birer bulan
              ve her bir sonucu yeni bir arrayin elemani yapan ve yeni arrayi ekrana yazdiran bir program yaziniz.
              input {{10,20,30},{4},{6,7,20}} ==> output ={60,4,33}
     */
        int[][] arr = {{10,20,30},{4},{6,7,20}};
        int[] brr = new int [arr.length];
        
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                brr[i] = brr[i] + arr[i][j];
            }
        }
        System.out.println(Arrays.toString(brr));


    }

}
