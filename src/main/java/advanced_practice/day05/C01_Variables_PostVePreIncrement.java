package advanced_practice.day05;

public class C01_Variables_PostVePreIncrement {

    public static void main(String[] args) {

        int x = 20;
        int y = 15;

        System.out.println(x);//20
        System.out.println(x++);//20
        System.out.println(x);//21

        System.out.println(x++ + ++y);//37
        System.out.println(x+y);//38

        int z = 5;
        System.out.println(++z + z++ + --z + z-- + z);//29


    }

}
