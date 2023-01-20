package day03scanner;

public class Car {

    //Class ==> Variables (Pasif Ozellikler) ==> Object
               //Method (Aktif Ozelliker)



    public String model = "Corolla"; //pasif ozellikler Variables
    public int fiyat = 20000;


    public static void main(String[] args) {

        //Class ismini yazin,  Objeye isim verin   =   new keywordunu kullanin,    Class ismi () yani Constructor

                Car                myCorolla        =           new                     Car();

        System.out.println(myCorolla.fiyat);

        System.out.println(myCorolla.model);

        myCorolla.hareket();

        myCorolla.dur();



    }//main'in bodysi

    //Note: "return type" void oldugunda method icinde "return" kelimesi kullanilmaz
    public void hareket(){
        System.out.println("Toyota guvenle hareket eder...");

    }

    public void dur(){
        System.out.println("Toyota guvenle durur...");

    }

}//class body'si
