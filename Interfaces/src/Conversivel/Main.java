package Conversivel;

public class Main {
    public static void main(String[] args){
        Conversivel con[] = new Conversivel[3];
        con[0] = new Moeda(250.45);
        con[1] = new Temperatura(120);
        con[2] = new UnidadeMedida(132);

        for(Conversivel i : con){
            i.converter();
            IO.println();
        }
    }

}
