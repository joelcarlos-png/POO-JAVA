package Conversivel;

public class UnidadeMedida implements Conversivel {
    private double Km;

    public UnidadeMedida(double km){
        this.Km = km;
    }

    public double getKm(){return Km;}
    public void setKm(double val){this.Km = val;}

    @Override
    public void converter() {
        System.out.printf("Valor em Km: %.3f -> valor em Cm: %.2f", Km, Km * 100000);
    }
}
