package day15arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        // Bir String'deki sesli harflerin sayisini bulan kodu yaziniz
        //   a - e - i - o - u - A - E - I - O - U
        String str = "Java ogrenince para kazanmak ne kolay, ogrenmeyince ne kadar zor ";
        str = str.toLowerCase();
        String harfler[] = str.split("");

        int counter = 0;

        for (String w : harfler) {  // iter yazarsaniz for-each loop otomatik tamamalar fori gibi

            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);

    }

}
