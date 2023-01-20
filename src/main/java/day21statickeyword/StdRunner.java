package day21statickeyword;

import java.util.List;

public class StdRunner {

    public static void main(String[] args) {

        // stdName static oldugundan, ona ulasmak icin ona ulasmak icin object olusturmadik
        // sadece class ismini kullanmak yeterlidir
        System.out.println(Student.stdName);

        // age non-static oldugudan ona ulasmak icin object olusturmak zorundayiz
        Student std1 = new Student();
        System.out.println(std1.age);

        String initials = Student.getInitials("Tom Cruise");
        System.out.println(initials); // TC

        int vowels = std1.countVowels("Tom Cruise");
        System.out.println(vowels); // 4

        // static olanlari object ile cagirmak tavsiye edilmez
        String s = std1.getInitials("Robert Downey");
        System.out.println(s);

        // List olusturmada yeni bir bilgi, listeye tek tek eklemek yerine boyle koyabiliriz
        List<String> names = List.of("Ali" ,"Veli", "Can", "Kemal");
        System.out.println(names);
    }


}
