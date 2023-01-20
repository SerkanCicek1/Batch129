package day22staticblocksconstructors;

public class StaticBlocks01 {

    // Bir variable olusturdugunuzda, deger atamazsaniz o variable'i "initialize" etmediniz demektir
    // Static variable'lar static block'lar icinde initialize edilirse, o class'in icinde herseyden once hazır hale getirilmis olur
    // Bazen main method calistirilmada once variable'larin hazir hale getirilmesi gerekir, bu yüzden static block'lar kullanilir

    // Note: "static block" lar static variable'lari initialize etmek icin kullanilir
    // Note: "static block" class icinde "herseyden once" calistirilir
    static double pi;
    static String shape;

    static {
        pi = 3.14;
        System.out.println("Static block 1");
    }

    static {
        shape = "Circle";
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }

}
