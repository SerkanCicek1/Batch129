package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
          Java'da method nasil olusturulur ?

          1) main method'un disinda olusturulur
          2) Access Modifier + Return Type + Method Ismi + () + {}

          Olusturularn method'lar nasil kullanilir ?
          1) main method'un icinden kullanilir
          2) method'un ismini yazin
          3) islem yapacaginiz sayilari parantezin icine koyun
     */

    public static void main(String[] args) {

        int sonuc = add(30, 50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        int ucluSonuc = firstTwoMultiplyThirdAdd(6, 4, 8);
        System.out.println(ucluSonuc);

        double kupSonuc = getCube(5);
        System.out.println(kupSonuc);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    protected static long multiply(int a, int b) {
        return a * b;
    }

    //Ornek: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullanin
    public static int firstTwoMultiplyThirdAdd(int a, int b, int c) {
        return (a * b) + c;
    }

    //Ornek: Verilen bir ondalik sayinin kupunu hesaplayan methodu olusturup kullaniniz
    //Not: Access Modifier'i default yapmak icin default yazmayiniz

    static double getCube(double a) {
        return a * a * a;
    }

    //ODEV 1) Diktortgen alanini hesaplayan methodu olusturup kullaniniz
    //ODEV 2) Diktortgen cevresini hesaplayan methodu olusturup kullaniniz
    //ODEV 3) Dairenin alanini hesaplayan methodu olusturup kullaniniz
    //ODEV 4) Dairenin cevresini hesaplayan methodu olusturup kullaniniz


}
