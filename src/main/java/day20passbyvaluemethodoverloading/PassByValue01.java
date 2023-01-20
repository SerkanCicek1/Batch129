package day20passbyvaluemethodoverloading;

public class PassByValue01 {

    public static void main(String[] args) {

        /*
        1) Java "pass-by-value" sayesinde variable'larin orjinal degerini koruma altina alir
         */

        double shirt = 100;

        double studentShirtPrice = discount("student",shirt);
        System.out.println(studentShirtPrice); // 90

        double veteranShirtPrice = discount("veteran",shirt);
        System.out.println(veteranShirtPrice); // 80

        double seniorShirtPrice = discount("senior",shirt);
        System.out.println(seniorShirtPrice); // 95

        System.out.println(shirt); // 100

    }

    public static double discount(String state, double price){

        switch (state){

            case "student":
                price = price * 0.9;
                break;

            case "veteran":
                price = price * 0.8;
                break;

            case "senior":
                price = price * 0.95;
                break;

            default:
                price = price;
        }
        return price;
    }

}
