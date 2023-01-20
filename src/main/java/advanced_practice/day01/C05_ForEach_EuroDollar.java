package advanced_practice.day01;

public class C05_ForEach_EuroDollar {

    public static void main(String[] args) {

     /*
         Example: Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
                  String str = "$1 $12 €34 €56 $45 €78";
                  dolarToplami: 58
                  euroToplami: 168
      */
        String str = "$1 $12 €34 €56 $45 €78";

        String arr[] = str.split(" ");
        int dolarToplam = 0;
        int euroToplam = 0;

        for (String w : arr){
            if (w.contains("$")){
                dolarToplam += Integer.parseInt(w.replaceAll("\\D",""));
            } else euroToplam += Integer.parseInt(w.replaceAll("\\D",""));
        }
        System.out.println("dolarToplam: " + dolarToplam);
        System.out.println("EuroToplam: " + euroToplam);




    }

}
