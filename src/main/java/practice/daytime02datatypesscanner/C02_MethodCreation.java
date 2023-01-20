package practice.daytime02datatypesscanner;

public class C02_MethodCreation {

    //Dikdortgenin alaninin hesaplayan methodu olusturunuz ve kullaniniz

    public static void main(String[] args) {

        // protokol alani
        System.out.println(dikdortgenAlani(5,10));



    }


      //    Acces Modifier + static + Data Type + MethodAdi + (parametreler) + {}
    public static int dikdortgenAlani(int a, int b){ //main method static oldugu icin main icindeki herseyin static olmasi gerekir
        return a * b;
    }




}
