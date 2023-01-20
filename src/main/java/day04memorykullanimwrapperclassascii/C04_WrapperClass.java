package day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {

    /*
    Non-Primitive Data turleri sadece data barindirmak icin degil ayni zamanda method'da bulundurur
    Primitive Data turleri ise sadece deger sakalr.Java bu duruma bir cozum uretmistir.
    Her primitive data turunu non-primitive olarak kullanmak icin ozel Class'lar olusturulmustur.
    Oracle firmasinin urunu olan Java primitivelere method ekleyerek bu yeni yapiya "Wrapper Class" adını vermistir


    Primitive           Wrapper
      byte      ==>      Byte
      short     ==>      Short
      int       ==>     Integer     bu farklı dikkat
      long      ==>      Long
      float     ==>      Float
      double    ==>      Double
      boolean   ==>      Boolean
      char      ==>     Character   bu da farklı dikkat

     */

    public static void main(String[] args) {

        byte primitiveByte = 12; //primitive data type'larinda nokta koyunca method gelmez
        Byte wrapperByte = 12;  // ancak wrapper class'larda nokta koyunca tum bir cok gozukur


        //Ornek: Byte data tpye'inin en kucuk ve en buyuk degerini ekrana yazdirin

        byte max = Byte.MAX_VALUE; //-128
        byte min = Byte.MIN_VALUE; // 127
        System.out.println("Byte max: " + max +"\n" + "Byte min: " + min);

        //Ornek: short, int, long data type'larinin max ve min degerlerini ekrana yazdirin

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);


        //    Primitive'ler Wrapper Classlara Nasil Cevrilir (Autoboxing)  //

        float f1 = 13.99F; //kucuk kutu primitive
        Float wrapperF1 = f1;

        //    Wrapper Class'lari Primitive Data Type'larina Nasil Cevrilir (Unboxing)   //

        Character w1 = 's';
        char primitiveW1 = w1;
        //Note: Autoboxing ve Unboxking Java tarafindan otomatik yapilir

        //Ornek: Verilen iki String datanin toplamini veren kodu yaziniz

        String str1 = "12345";
        String str2 = "6789";
        System.out.println(str1 + str2); //123456789   burda yan yana birlestirdi
        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); //19134   burda topladı














    }

}
