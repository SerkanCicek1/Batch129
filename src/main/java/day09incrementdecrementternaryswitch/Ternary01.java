package day09incrementdecrementternaryswitch;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1:
        int a = 10;
        int b = 20;

        int r1 = a < b ? a++ : ++b;

        System.out.println(r1); // 10
        System.out.println(a); // 11
        System.out.println(b); // 20


        //Example 2: Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz
        //           -4 ==> -1 * 4        4 ==> 4        0 ==> 0

        int c = -4;
        int r2 = c < 0 ? -1 * c : c;

        System.out.println(r2); // 4


        //Example 3: Iki sayinin isareti ayni ise bu sayilari carpan, isaretleri farkli ise
        //           "Farkli isaretli sayilari carpamiyorum" mesaji veren kodu yaziniz

        int m = 5;
        int n = 6;

        // "Object" Java da butun Non-Primitive Data Type(Class)'larinin ortak "Parent" idir.
        // "Object" in "Parent" i yoktur.
        // Farkli data type'lari icin ortak bir variable olusturmak istedigimizde, data type olarak Object kullaniriz
        // Java'da "Object" insanlik aleminde "Hz.Adem" e benzer "Parent" i yoktur.
        Object r3 = (m > 0 && n > 0) || (m < 0 && n < 0) ? m * n : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);


        //Example 4: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz

        //  1.Yol
        int x = 143;

        String r4 = (x < 1000 && x > 99) || (x > -1000 && x < -99) ?  x + ": 3 basamakli sayidir" : x + ": 3 basamakli sayi degildir";
        System.out.println(r4);

        //  2.Yol
        int y = -678;

        int z = Math.abs(y);
        String r5 = (z > 99 && z < 1000) ? y + ": 3 basamakli sayidir"  : y + ": 3 basamakli sayi degildir" ;
        System.out.println(r5);






















    }

}
