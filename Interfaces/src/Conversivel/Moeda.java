package Conversivel;

public class Moeda implements Conversivel {
    private double valorReal;

    public Moeda(double valorReal){
        this.valorReal = valorReal;
    }

    public void setValorReal(double valor){this.valorReal = valor;}
    public double getValorReal(){return valorReal;}

    @Override
    public void converter() {
        System.out.printf("Valor em R$: %.2f -> Valor em U$: %.2f", valorReal, valorReal / 5.05);
    }
}
