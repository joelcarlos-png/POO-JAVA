package PaySystem;

public class PagamentoBoleto extends Pagamento {
    String codigoDeBarras;

    public PagamentoBoleto(double valor, String descricao, String codigoDeBarras){
        super(valor, descricao);
        this.codigoDeBarras = codigoDeBarras;
    }

    @Override
    public void processarPagamento() {
        System.out.printf("===Pagamento===\nValor: %.2f\nDescricao: %s\n===============\nPagado no boleto | codigo: %s\n===============\n", valor, descricao, codigoDeBarras);
    }

    public String getCodigoDeBarras(){return codigoDeBarras;}
}
