package day30exceptionsinterface;

public class HondaRunner {

    public static void main(String[] args) {

        Civic myCivic = new Civic();
        myCivic.cool();

        System.out.println(AC.price);
        System.out.println(Engine.price);
        System.out.println(Security.price);
        System.out.println(AC.model);

        Accord myAccord = new Accord();
        myAccord.cool();

    }

}
