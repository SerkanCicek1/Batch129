package day28exceptions;

public class Exceptions01 {

    /*
    1) Exception demek beklenmedik problem demetir.Seyahatte benzinin bitmesi, arabanın bozulması gibi istisna
    2) Gercek hayatta karsilastigimiz beklenmedik problemler icin cozum yollarimiz vardir.Mesela benzin bitince Yol Yardim'i arariz
       Application'larda da beklenmedik problemler icin cozum yollari uretiriz, bu isleme "Exception Handling" denir
    3) Exception'lar temel olarak ikiye ayrilirlar:
       a) Compile Time Exception: Siz code yazarken farkedilir ve yazdiginiz kodun alti kirmizi cizgi ile cizilir
       b) Run Time Exception: Siz code yazarken fark edilmez ama code'u calistirdiginizda console'da hata alirsiniz
    4) Exception'lar disinda "Error" diye adlandirdigimiz "Handle" edilemeyen problemler vardir
       Application'larda "Memory" nin dolmasi "Error" dur.
       Iki tur memory var:
          a)Stack Memory dolarsa "StackOverFlow Error" alirsiniz
          b) Heap Memory dolarsa "OutOfMemory Error" alirsiniz
     5) Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
     6) If else kullanirsak olusabilecek her problemi spesifik olarak if parantezinin icine yazmamiz gerekir
        Bu da ciddi bir matematik bilgisi gerekir, ve yazacagimiz code'u cok uzatir
        Ama try Catch'te Java ilgili Exception ile alakali olusabilecek buyun problemleri yakalar
     */

    public static void main(String[] args) {

        int a = 12;
        int b = 3;

        divide(a,b);

        divide2(a,b);

    }

    // ArithmeticException yazdiginiz code'da matematiksel islem kullaniyorsaniz alinabilecek bir Exception'dir
    // Nasil handle edilecegini asagida yazdik(try-catch)
    public static void divide(int a, int b){
        try {
            System.out.println(a / b);
            System.out.println("I m here");

        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }
        System.out.println("You m here");
    }

    // "Exception Handling" de if-else kullanilmaz. Bakiniz 6. note
    public static void divide2(int a, int b){
        if (b == 0){
            System.out.println("Do not divide by zero");
        } else {
            System.out.println(a / b);
        }
    }
}
