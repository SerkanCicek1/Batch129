package day28exceptions;

public class Exceptions02 {

    public static void main(String[] args) {

        String s = "1234";

        convertStringtoInt(s);

        String t ="1a2b";
        convertStringtoInt(t);
    }

    // Icinde rakamlar disinda character olan bir String'i sayiya cevirmek isterseniz Java "NumberFormatException" atar
    public static void convertStringtoInt(String s){

        int intS = 0;

        try {
            intS = Integer.valueOf(s);
        }catch (NumberFormatException e){
            System.out.println("Bir String'in sayiya donusturulebilmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());
        }

        System.out.println(intS + 1);
    }

}
