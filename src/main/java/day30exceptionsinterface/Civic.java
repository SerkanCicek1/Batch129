package day30exceptionsinterface;

public class Civic implements AC,Engine,Security {

    /*
     1) Bir interface'i bir Class'in parent'i yapmak icin "implement" keyword'unu kullaniriz
     2) Java parent'lar "Class" oldugunda "multiple parent"a musade etmez ama biz bazen "multiple parent"a
        ihtiyac duyariz.
        Bu ihtiyaci gidermek icin Java "interface" ismini verdigi yeni bir yapi olusturdu.
        Bu yapi sayesinde bir "Class" icin coklu "interface" parent olusturabiliriz.
     3) Coklu interface parent'larin icine ayni isimli method'lar koyabiliriz
        Mesela AC'nin, Engine'in ve Security'nin iclerine "run()" koymak gibi
        Child Class herhangi birini override ettiginde hepsini override etmis gibi olur sonra da
        body'yi Child Class'da yazarak uygulamasini yapmis olur
     */

    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("AC runs perfectly");
    }


}
