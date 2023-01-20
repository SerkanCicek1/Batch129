package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example: String bir array olusturun, 6 tane eleman yerlestirin ve character sayisi 5 den cok olan
        //         elemanlari siliniz
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Bue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";
        System.out.println(Arrays.toString(colors));

        int counter = 0;
        for (String w : colors){
            if(w.length() < 6){
                counter++;
            }
        }
        String newColors[] = new String[counter];

        int idx = 0;
        for (String w : colors){
            if (w.length() < 6){
                newColors[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors));




    }

}
