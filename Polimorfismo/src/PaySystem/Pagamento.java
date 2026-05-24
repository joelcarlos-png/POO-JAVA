package PaySystem;

public abstract class Pagamento{
    double valor;
    String descricao;

    public double getValor(){return valor;}
    public String getDescricao(){return descricao;}

    public Pagamento(double valor, String descricao){
        this.descricao = descricao;
        this.valor = valor;
    }

    public void exibirDados(){
        System.out.printf("==============\nValor: %d\nDescricao: %s\n==============\n");
    }

    public abstract void processarPagamento();
}
