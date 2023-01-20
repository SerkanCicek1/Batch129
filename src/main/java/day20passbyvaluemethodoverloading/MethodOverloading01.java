package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {

    public static void main(String[] args) {

        /*
         1) Method Overloading yaparken method ismi degistirilmez

         2) Method Overloading yaparken parametre degistirilir
           a) parametre degistirilirken, parametrenin data type'lari degistirilebilir
           b) parametre degistirilirken, parametrenin data type'lari farkli ise yerleri degistirilebilir
           c) parametre degistirilirken, parametrenin sayisi degistirilebilir

         3) Java icin ismi ve parametreleri ayni olan iki method tamamiyla aynidir
            bu yüzden "ismi" ve "parametre" "Method Signature" olarak adlandirilir

         4) Method Overloading olustururken return tpye'i degistirmenin hicbir etkisi yoktur
            Method Overloading olustururken access modifier'i degistirmenin hicbir etkisi yoktur
            Method Overloading olustururken methodu static veya non-static yapmanin degistirmenin hicbir etkisi yoktur
            Method Overloading olustururken method body'i degistirmenin hicbir etkisi yoktur

         5) "private" method's can be overloaded.Cunku method overloading sadece bir class'in icinde olur
            "private" olmak ise baska class'lara gidildiginde problem olusturur

         6) "static" method'lar overload edilebilirler
         */

        add(3,5);

    }

    public static void add(int a, int b){
        System.out.println(a + b);
    }

    public static void add(double a, double b){
        System.out.println(a + b);
    }

    public static void add(double a, int b){
        System.out.println(a + b);
    }

    public static void add(int a, double b){
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a + b + c);
    }

}
