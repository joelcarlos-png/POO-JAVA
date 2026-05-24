package PaySystem;

public class PagamentoPix extends Pagamento{
    String chavePix;

    public PagamentoPix(double valor, String descricao, String chavePix){
        super(valor, descricao);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.printf("===Pagamento===\nValor: %.2f\nDescricao: %s\n===============\nPagado no Pix | Chave pix: %s\n===============\n", valor, descricao, chavePix);
    }

    public String getChavePix(){return chavePix;}
}
