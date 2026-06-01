package Conversivel;

public class Temperatura implements Conversivel {
    private double Fa;

    public Temperatura(double Fa){
        this.Fa = Fa;
    }

    public double getFa(){return Fa;}
    public void setFa(double tem){this.Fa = tem;}

    @Override
    public void converter() {
        double celcius = (Fa - 32) / 1.8;
        System.out.printf("Temperatura em Farenheit: %.2f -> Temperatura em Celcius: %.2f", Fa, celcius);
    }
}
