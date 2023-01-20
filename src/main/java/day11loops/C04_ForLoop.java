package day11loops;

public class C04_ForLoop {

    public static void main(String[] args) {

        //Example: 1'den 100'e kadar 6'ya bolunenler haric tum sayilari yazdirin

        for (int i = 0; i < 101; i++) {

            if (i % 6 == 0){
                continue; // bosver, devam et
            }
            System.out.print(i + " ");
        }

        System.out.println();

        // Interview Question

        //Size verilen bir String'i ters ceviren kodu yaziniz
        String str = "Mustafa"; // afatsuM
        String ters = "";

        for (int i = str.length() - 1; i > -1 ; i--) {
            char harf = str.charAt(i);
               ters += harf;
        }
        System.out.println(ters);





    }

}
