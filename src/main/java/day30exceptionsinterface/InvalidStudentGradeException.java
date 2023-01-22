package day30exceptionsinterface;

public class InvalidStudentGradeException extends Exception{

    /*
     1)Kendi application'iniza ozel kurallar olusturmak icin kendi "Exception Class" larinizi olusturabilirsiniz.
     2)Olusturdugunuz "Exception Class" lar;
        a)Compile Tile Exception
        b)Run Tile Exception olabilir.
     3)"Compile Tile Exception" olusturmak icin class'inizin parent'i "Exception Class" olmalidir.
     4)"Run Tile Exception" olusturmak icin class'inizin parent'i "RuntimeException Class" olmalidir.
     5)Kendi olusturdugumuz Exception Class'lara "Custom Exception Class" denir.
     */

    public InvalidStudentGradeException(String message){

        super(message);

    }

}
