package day29exceptions;

public class Exceptions01 {

    public static void main(String[] args) {

        Object obj = 70;
        String str = "";

        try {
            str = (String)obj; // Birbirine donusturulemeyen data type'larini donusturmek isterseniz Java ClassCastException atar

        } catch (ClassCastException e){
            System.out.println("Her data type'i her data type'ine cevrilmez");

        }
        System.out.println(str);

    }

}
