package PaySystem;

public class PagamentoCartao extends Pagamento {
    String numeroCartao;

    public PagamentoCartao(double valor, String descricao, String numeroCartao){
        super(valor, descricao);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.printf("===Pagamento===\nValor: %.2f\nDescricao: %s\n===============\nPagado no Cartao | Numero do cartao: %s\n===============\n", valor, descricao, numeroCartao);
    }

    public String getNumeroCartao(){return numeroCartao;}
}
