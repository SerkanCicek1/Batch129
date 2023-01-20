package day23datetimestringbuilder;

public class StringBuffer01 {

    /*
      String olusturmak icin String Class, StringBuilder Class ve StringBuffer kullanilabilir
         1) StringBuffer Java'nin String uretmek icin olusturdugu ilk Class'dir, Java 5 de uretilmistir
         2) StringBuffer "synchronized" dir, StringBuilder degildir.
         3) StringBuffer "thread-safe" dir, StringBuilder degildir.
         4) StringBuffer ve StringBuilder, ikisi de mutable dir

      Note: Immutable String lazim oldugunda String Class kullaniriz
      Note: Mutable String lazim oldugunda StringBuilder veya StringBuffer kullaniriz
      Note: StringBuffer "Muştithread" ve "Synchronization" lazimsa tercih edilir, degilse StringBuilder kullanilir
     */

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);

        System.out.println(sbf.capacity()); // 20

    }

}
