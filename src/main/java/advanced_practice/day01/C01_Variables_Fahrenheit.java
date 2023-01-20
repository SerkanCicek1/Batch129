package advanced_practice.day01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class C01_Variables_Fahrenheit {

    public static void main(String[] args) {

        // Example: Fahrenheit değeri, Celsius değere çeviren kod yazınız.
        // formül: c = (f-32)*5/9
        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz: ");

        double f = input.nextDouble();
        double c = (f - 32) * 5 / 9;

        System.out.println("Celcius: " + c);

        // Asagida ondalik kismin kaç basamak olcagini belirleyip tekrar yazdirdik
        DecimalFormat format = new DecimalFormat("0.00"); // "."dan sonra kac sayi gorun
        String formattedCelcius = format.format(c);

        System.out.println("formattedCelcius = " + formattedCelcius);

        //2.yol  printf
        // Bu daha kısa olani, "DecmalFormat" olusturmadan kisa bi sekilde yapabiliyoruz
        System.out.printf("Formatli: " + "%.2f", c); // % ==> herhangi bir sayi 2f ==> 2 basakmlik olsun, f => format


    }

}
