package advanced_practice.day13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C02_Map_Aile {
    //Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.
    public static void main(String[] args) {


        advanced_practice.practice13.Aile ali = new advanced_practice.practice13.Aile("Ali","Can",15,"Ahmet","Hayriye");
        System.out.println("ali.getAileMap() = " + ali.getAileMap());
        advanced_practice.practice13.Aile veli = new advanced_practice.practice13.Aile("Veli","Han",25,"Mehmet","Hatice","Hasan","Hüseyin");
        System.out.println("veli.getAileMap() = " + veli.getAileMap());
        advanced_practice.practice13.Aile ayse = new advanced_practice.practice13.Aile("Ayşe","Tan", 35, "Fatma");
        System.out.println("ayse.getAileMap() = " + ayse.getAileMap());

    }

}