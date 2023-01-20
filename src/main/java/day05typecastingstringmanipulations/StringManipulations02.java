package day05typecastingstringmanipulations;

public class StringManipulations02 {


    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example: "s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnds = s.endsWith("money");
        System.out.println(isEnds); // true


        //Example: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.
        String s1 = s.replace("money", "dollar");
        System.out.println(s1); // Learn Java earn dollar


        //Example: "s" String'indeki "earn" kelimesini "win" kelimesine ceviriniz
        String s2 = s.replace("earn", "win");
        System.out.println(s2); // Lwin Java win money


        //Example: "s" String'indeki "a" harflerini "*" a ceviriniz
        //Note: replace() method'unda tekli character ile calisirken cift veua tek tirnak kullanabilirsiniz, farketmez
        String s3 =s.replace("a", "*");
        System.out.println(s3); // Le*rn J*v* e*rn money


        //Note: Ya ikisi de çift tirnak olmalıdır ya da ikisi de tırnak olmalıdır.
        //Example: "s" String'indeki "n" harflerini "XXX" a çeviriniz
        String s4 = s.replace("n","XXX");
        System.out.println(s4);


        //Example: "s" String'indeki tum "e" harflerini siliniz
        //Note: "Hicbir sey" char data type'inda yok, bu yuzden replace() methodu kullanarak silme islemi "" ile yapılır
        String s5 = s.replace("e", "");
        System.out.println(s5); // Larn Java arn mony



        String t = "Ali 13 yasindadir!...";

        //Example: "t" String'indeki tum rakamlari (0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a ceviriniz
        //Note: Bir grup data'yi degistirmek icin replaceAll() kullanilir.
        //Note: Bir grup data'yi ifade etmek icin "Regular Expressions" (Regex)  kullaniriz.
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1); // Ali ** yasindadir!...


        /*
                      //        Meshur Regex'ler        //
             1) Tum rakamlar ==> [0-9]
             2) Tum kucuk harfler ==> [a-z]
             3) Tum buyuk harfler ==> [A-Z]
             4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
             5) Tum harfler ve rakamalar ==> [a-zA-Z0-9]
             6) Tum noktalama isaretleri ==> \\p{pUNCT}
             7) Tum sesli harfler ==> [aeiouAEIOU]
                x, q, w harfleri ==> [xqw]

             8)Kucuk harflerden farkli tum character'ler ==> [^a-z]
             9)Tum harflerden farkli tum character'ler ==> [^a-zA-Z]


         */


        //Example: "t" String'indeki tum rakamlari ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[0-9a-zA-Z]", "!");
        System.out.println(t2);


        //Example: "t" String'indeki tum sesli harfleri "?" e ceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);


        //Example: "t" String'indeki kucuk harfler disindaki tum character'leri "<>" yapiniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);


        //Example: "t" String'indeki tum harfler disindaki tum character'leri "+" yapiniz
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);


        //Example: "t" String'indeki space'ler disindaki tum character'leri "$" yapiniz
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);


        //Example: "t" String'indeki sesli harfler disindaki tum character'leri "&" yapiniz
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);


    }

}
