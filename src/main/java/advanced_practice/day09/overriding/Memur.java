package advanced_practice.day09.overriding;

public class Memur extends Banka{

    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi * 0.1;
    }
}
