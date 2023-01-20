package day25inheritance;

public class Honda extends Car {

    public void engine(){
        System.out.println("Honda engine...");
    }

    public Honda(){
        this("R8",2023);
        System.out.println("Honda 1");
    }

    public Honda(String model, int year){
        super("Audi");
        System.out.println("Honda 2: " + model + " - " + year);
    }




}
