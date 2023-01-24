package advanced_practice.day11.interface_maas_hesaplama;

public class MaasHesapla implements Vergi,MaasArtir{

    @Override
    public double yillikEkstra(int calismaYili) {
        return calismaYili * 100;
    }

    @Override
    public double saatlikEkstra(int calismaSaati) {
        return (calismaSaati-160) * 10;
    }

    @Override
    public double vergi(double brutMaas, int calismaYili) {

        if (calismaYili >= 10){
            return brutMaas * 0.3;
        } else {
            return brutMaas * 0.2;
        }
    }

    public double netMaas(double brutMaas, int calismaYili, int calismaSaati){
        return brutMaas + yillikEkstra(calismaYili) + saatlikEkstra(calismaSaati) - vergi(brutMaas, calismaYili);
    }

}
