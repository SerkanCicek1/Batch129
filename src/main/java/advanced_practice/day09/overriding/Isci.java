package advanced_practice.day09.overriding;

public class Isci extends Banka{

    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi * 0.15;
    }
}
