package advanced_practice.day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C06_MountainArray {

    public static void main(String[] args) {

        /*
         Bir Array'in Mountain Array olup olmadýðýný kontrol eden bir kod yaziniz
         Mountain Array: Element degerleri bir noktaya kadar sürekli artip o noktadan sonra surekli azalan Array.
        */
        int[]  arr = {-999,1, 2, 5, 7, 9, 22, 8, 3, 1, -100};

        // Array'i List'e cevir:
        List<Integer> list = new ArrayList<>();

        for (int w : arr) {
            list.add(w);
        }

        // Max degeri bul
        int max = list.get(0);

        for (Integer w : list) {
            if (w > max){
                max = w;
            }
        }

        System.out.println("max = " + max);

        // List1
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == max){
                break;
            }
            list1.add(list.get(i));
        }
        System.out.println("list1 = " + list1);

        //List2
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (i < list.indexOf(max)){
                continue;
            }
            list2.add(list.get(i));
        }
        System.out.println("list2 = " + list2);

        // Yedekleyip kopyala
        List<Integer> list1copy = new ArrayList<>();
        List<Integer> list2copy = new ArrayList<>();

        Collections.sort(list1copy);
        Collections.sort(list2copy);
        Collections.reverse(list2copy);

        System.out.println("list1copy = " + list1copy);
        System.out.println("list2copy = " + list2copy);

        // Kontrol
        if (list1.equals(list1copy) && list2.equals(list2copy)){
            System.out.println("Mountain Array");
        }


    }

}
