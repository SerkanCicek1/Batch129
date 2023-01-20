package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable oluşturmak
        //Java cümlesi = Statement
        //Java'da esittir demek "==" yani matematikde "=", java'da "=="
        //Java'da "=" assignment operator yani sagdaki degeri alır soldaki kutuya koyar
        //Access Modifier yazmazsanız "access modifier" "default" demektir
        //Data Type + Variable Name ==> Variable Declaration
        //Assignment Operator(Atama Operatoru)  +  Variable degeri ==> Assignment
        //Eger Variable Declaration yapar, Assignment yapmazsaniz Java kendi degerlerini(default) koyar
        //Default degerler sayılar için sıfırdır

        //Data type'ını yazınız    Variable ismi    Assigment operator     Variable değeri    İngilizcedeki nokta
                   int                   age                =                    13                    ;

        //Ornek: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //Note : String'lere verilen degerler cift tırnak icinde olmalidir
        //Note : Java buyuk ve kucuk harfe duyarlidir yani "True" ve "true" veya "TRUE" tamamen farklıdır
        //String'ler icin "default value" "null" dir

        String studentName = "Ali Can";

        /*
         Java'da temelde iki tip data vardir;
         1)primitive data type
             a) char:    tek karakterler icin kullanilir ve tek tırnak icine alınır. 'a', 'x', '?' (2 byte)
             b) boolean: boolean'lar sadece iki farklı deger alabilir : true veya false (1 bit)
             c) byte:   -128 den +127 e kadar tam sayi degerleri icin kullanilir (1 byte)
             d) short:  -32768 ile 32767 arasindaki tam sayilar icin kullanilir (2 byte)
             e) int:    -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icin kullanılır (4 byte)
             f) long:   -9,223,372,036,854,775,808 ile +9,223,372,036,854,775,807 arasindaki sayılar icin kullanilir (8 byte)
             g) float:   ondalıklı sayılar(Decimal Numbers) icin kullanilir, virgulden sonra 7 basamak icerir sonuna "F" veya "f" konur (4 byte)
             h) double:  ondalıklı sayılar(Decimal Numbers) icin kullanilir, virgulden sonra 16 basamak icerir, genelde double kullanılır (8 byte)
         2)non-primitive data type
         */

        //Ornek: Char data type'ında ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        //Note : Char data type'ında degerler tek tırnak icine konulmalıdır
        char aHarfi = 'a';

        //Ornek: Boolean data type'ında emekli misin sorusuna bir variable oluşturup false degerini atayın
        boolean emekliMisin = false;

        //Ornek: Byte data type'ında ögrenci yasi icin bir variable oluşturup deger atayiniz
        byte studentAge = 23;

        //Ornek: Site nufusu icin bir variable olusturup deger atayiniz
        short siteNufusu = 1200;

        //Ornek: Ulke nufuslari icin bir variable olusturup deger atayiniz
        int countryPopulation = 1864184648;

        //Ornek: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz
        //Note: Eger long kullanırsak Java onu int kabul eder memory korumak icin ama eger sonuna "L" koymazsak
        //Note: Bir deger long ise sonuna "L"(Tercih edilir)  veya "l" konulur
        long cellNumberInHumanBody = 5223372036854775807L;

        //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna "L" koymaya gerek yok
        long weightOfSun = 1234567;

    }


}
