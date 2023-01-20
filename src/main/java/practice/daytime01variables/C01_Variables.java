package practice.daytime01variables;

public class C01_Variables {

    public static void main(String[] args) {

        // byte; short; integer; long; double; float Data Type'larinin max ve min degerini yazdiran kodu yaziniz

        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byteMax = " + byteMax); //127
        System.out.println("byteMin = " + byteMin); //-128


        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;

        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);

        int intMax = Integer.MAX_VALUE;
        int intMiN = Integer.MAX_VALUE;

        System.out.println("intMax = " + intMax + ", intMin = " + intMiN);

        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;

        System.out.println("longMax = " + longMax + ", longMin = " + longMin);

        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;

        System.out.println("doubleMax = " + doubleMax + ", doubleMin = " + doubleMin);

        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;

        System.out.println("floatMax = " + floatMax + ", floatMin " + floatMin);



    }



}
