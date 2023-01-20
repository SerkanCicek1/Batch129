package day27encapsulationabstraction;

public class Student {

    private String stdId = "AC123";
    private double gpa = 3.99;
    private boolean poor = true;

    /*
     Encapsulation yapilmis data'yi okuyabili rmiyiz ?
     get method'lar(getter) encapsule edilmis(saklanmis) datayi okumamiza yarar
     get method'lar her zaman "public" olur
     get method'larin return type'i variable'in data type'i ile ayni olur
     get method'larin isimleri "get + variable name" seklinde olur
     get method'larin isimleri variable boolean ise "is + variable name" olur
     get method'lar parametre kullanmazlar

     */
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }

    /*
     Encapsulation yapilmis data'larin degeri degistirilebilir mi ?
     set method'lar(setter) encapsule edilmis(saklanmis) data'nin degerini degistirmemize yarar
     set method'lar her zaman "public" olur
     set method'larin return type'i her zaman void olur
     set method'larin isimleri "set + variable name" seklinde olur
     set method'lar variable ile ayni data type'inda parametre kullanirlar

     getter ve setter'larin ikisine birden "Java Beans" denir

     */


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}
