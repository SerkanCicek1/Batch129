package day24accessmodifiersinheritance;
public class StudentRunner {

    public static void main(String[] args) {

        // myStd.stdId      //default olan variable'lar ayni "Package" adindan ulasilabilir oldugundan bu class da gorulebilir
        // myStd.accountNumber // ayni package ile bir grup ve cocuklari tarafindan gorulebilir oldugu icin gorulur
        // "balance" Private oldugundan baska class da gorulemez .Student classin icindeki balance variable a bu class dan ulasamayiz.

        Student myStd = new Student();

    }
}
