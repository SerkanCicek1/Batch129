package advanced_practice.day07;

import javax.lang.model.SourceVersion;

public class C03_Static_Sirket {

    public static void main(String[] args) {

        //Basit bir şirket bütçesi kodu yazınız.

        Sirket dep1 = new Sirket();
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);
        dep1.paraAl(500);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        dep1.paraKazan(2000);
        Sirket.kasadanHarcanan(1000);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        System.out.println("dep1.depKazandigiParaToplami = " + dep1.depKazandigiParaToplami);

        Sirket dep2 = new Sirket();
        dep2.paraAl(500);
        dep2.departmanHarcamasi(250);
        dep1.departmanHarcamasi(100);
        System.out.println("Sirket.kasa = " + Sirket.kasa);
        System.out.println("dep2.depButcesi = " + dep2.depButcesi);
        System.out.println("dep1.depButcesi = " + dep1.depButcesi);//?
        dep2.paraKazan(5000);
        System.out.println("dep1.kasa = " + dep1.kasa);
        System.out.println("dep2.kasa = " + dep2.kasa);
    }

}
