package day02datatypesmethodcreation;

public class MethodHomework{

    //ODEV 1) Diktortgen alanini hesaplayan methodu olusturup kullaniniz
    //ODEV 2) Diktortgen cevresini hesaplayan methodu olusturup kullaniniz
    //ODEV 3) Dairenin alanini hesaplayan methodu olusturup kullaniniz
    //ODEV 4) Dairenin cevresini hesaplayan methodu olusturup kullaniniz
    //ODEV 5) Ucgenin alanini hesaplayan method olusturup kullaniniz
    //ODEV 6) Ucgenin cevresini hesaplayan method olusturup kullaniniz


    public static void main(String[] args) {
        int areaRectangle = diktortgenAlan(8,4);
        System.out.println(areaRectangle);

        int perimeterRectangle = diktortgenCevre(8,4);
        System.out.println(perimeterRectangle);

        double areaCircle = daireAlan(4);
        System.out.println(areaCircle);

        double perimeterCircle = daireCevre(4);
        System.out.println(perimeterCircle);

        double areaTriangle = ucgenAlan(7,8);
        System.out.println(areaTriangle);

        int perimeterTriangle = ucgenCevre(6,8,10);
    }

    public static int diktortgenAlan(int a, int b){
        return a * b;
    }

    public static int diktortgenCevre(int a, int b){
        return (a + b) * 2;
    }

    public static double daireAlan(double r){
        double π = 3.14;
        return π * r * r;
    }

    public static double daireCevre(double r){
        double π = 3.14;
        return 2 * π * r;
    }

    public static double ucgenAlan(int a, int b){
        return (a * b) / 2;
    }

    public static int ucgenCevre(int a, int b, int c){
        return a + b + c;
    }

}
