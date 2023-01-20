package day24accessmodifiersinheritance;

public class Animal {

    /*
       Inheritance'in faydalari;
         1) Code standardında tekrar iyi değildir.
         2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
         3) Gelişime update'e açık olmalıdır
         4) Code atomic yapıda olmalı.
         Note 1: "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
         Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
         Note 3: "public" method'lar child class'lar tarafindan kullanilabilir, inherit edilebilir
         Note 4: "protected" method'lar child class'lar tarafindan kullanilabilir, inherit edilebilir
         Note 5: "default" method'lar object ile ayni package'de olduklari surece inherit" edilebilir
                 ama default method ile object'in uretildigi class farkli package'lerde ise inherit edilemez
         Note 6: "private" method'lar inherit edilemez
         Note 7: Java birden fazla parent'i(multiple inheritance Java tarafından desteklenmez) onaylamaz
         Note 8: Object class a giderken Array ===>> List===> Collection  multi level inheritance diyebiliriz
         Note 9: Java'da "Object Class" tum Java Class'larinin ortak parent'idir.
         Note 10: Java'da Object Class haric tum class'larin parent'i vardir.
         Note 11: Java'da "parent" dan "child" a olan iliskilere "HAS-A Relationship" denir
         Note 11: Java'da "child" dan "parent" a olan iliskilere "IS-A Relationship" denir
         Note 12: Javada her classın bir tane default constructor'u vardır.
                  Bu default Constructor class'ın içinde görünmez. Çünkü default constructor "Object Class'tadıri
                  Bizim class'ımız default constructora ihtiyac duyduğunda parent olan "Object Class"a gider ve oradaki constructır'ı kullanır.

     */


    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }



}
