package day12loops;

public class C04_WhileLoop {

    public static void main(String[] args) {

        //Example: 3'den 10'a kadar tam sayilari ayni satira yazdirin

        //  1.Yol
        for (int i = 3; i < 11; i++) {
            System.out.println(i + " ");
        }


        System.out.println();


        //  2.Yol
        int i = 3;
        while (i < 11){
            System.out.print(i + " ");
            i++;
        }


        System.out.println();


        //Example: 17'den 4'e kadar tum cift sayilari yazdirin
        int j = 17;
        while (j > 3){
            if (j % 2 == 0){
                System.out.print(j + " ");
            }
            j--;
        }




    }

}
