package day27encapsulationabstraction;

public abstract class Courses {

    /*
    1) Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir
       Body'si olmayan method'lara "abstrac method" denir

    2) "abstract method" lar child class'lar tarafindan "override" edilmek zorundadir
       Bu yuzden, eger bir fonskiyonun child class'lar tarafindan kullanilmasini mecbur kilmak
       isterseniz o method'u abstract yapmak gerekir

    3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
       "acces modifier" ile "return type" arasine "abstract" keyword koymak gerekir.

    4) "abstract method"lar siradan class'larin icine yazilamazlar. "abstract method"larin icine yazildiklari classlar'da
       abstract olmak zorundadirlar.

    5) "abstract class" larda hem "abstract method" lar hem de "concrete method" lar kullanilabilir.

    6) "concrete class" lar "abstract class" larin child'i olabilirler.
       "abstract method" larin override edilme zorunlulugu "concrete class" lar icindir.
    */

    public abstract void math();

    public void art(){
        System.out.println("Painting...");
    }

    // final method'lar "override" edilemezler, halbuki "abstract" method'lar override edilmek icin olusturulurlar
    // bu celiskidir, bu yüzden Java abstract method'larin final olmasina musaade etmez.
    // public final abstract void science();

    // Concrete Class'lar final oldugunda Child Class'a sahip olamazlar
    // ama "Abstract Class" lar icin Child Class olmalidir, cunku Child Class'lar abstract parent class'daki abstract
    // method'lari kullanirlar.Bu yüzden Java Abstract Class'larin final olmasina musaade etmez

    // "abstract method" lar "private" olamazlar cunku Child class'lar "abstract method"lari kullanirlar, private yapinca kullanima kapali olur.
    // Bu celiskidir bu yuzden Java "abstract method"larin "private" olmasina musaade etmez.

    //"abstract method" lar "static" olamazlar, cunku static method'lar override edilemez, halbuki abstract method'lar override edilmek icin olusturulmustur.
}
