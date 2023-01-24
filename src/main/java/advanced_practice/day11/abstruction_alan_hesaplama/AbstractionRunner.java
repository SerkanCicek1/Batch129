package advanced_practice.day11.abstruction_alan_hesaplama;

public class AbstractionRunner {

    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

    public static void main(String[] args) {

        Diktortgen diktortgen = new Diktortgen();
        System.out.println(diktortgen.alanHesapla(5,4));
        System.out.println(diktortgen.alanHesapla(5,6));


        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.alanHesapla(5,4));
        System.out.println(ucgen.alanHesapla(2,4));


    }

}
