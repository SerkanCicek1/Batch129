package day08nestedif;

public class C02_NestedIf {

    public static void main(String[] args) {

        /*
        Password'un ilk harfi buyuk ise:
           'A' olursa "Gecerli Password" yazdirin, degilse "Gecersiz Password" yazdirin

        Password'un ilk harfi kucuk harf ise:
           'z' olursa "Gecerli Password" yazdirin, degilse "Gecersiz Password" yazdirin

         */

        String pwd = "5xy12!";
        char ilkHarf = pwd.charAt(0);

        if (ilkHarf > 'A' && ilkHarf < 'Z') {

            if (ilkHarf == 'A') {
                System.out.println("Gecerli Password");
            }
        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            System.out.println("Gecerli Password");
        } else {
            System.out.println("Gecersiz Password");
        }




    }

}
