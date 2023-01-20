package day14arraysforeachloop;

public class Arrays04 {

    public static void main(String[] args) {

        //Example: String bir array olusturun, 6 eleman ekleyin ve Yellow'dan onceki elemanlari yazdiriniz
        String[] colors = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        for(String w : colors){
            if (w.equals("Yellow")){
                break;
            }
            System.out.println(w);
        }


        //Example: String bir array olusturunuz, 6 eleman ekleyiniz ve Yellow'dan sonraki elemanlari yazdiriniz
        String[] color = new String[6];
        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blue";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Brown";

        // Note: Elemanlari almaya son elemandan baslayacagim icin for-each kullanamam, bu yüzden for-loop kullandim
        for (int i = color.length-1; i >= 0; i--) {
            if (color[i].equals("Yellow")){
                break;
            }
            System.out.println(color[i]);
        }



    }

}
