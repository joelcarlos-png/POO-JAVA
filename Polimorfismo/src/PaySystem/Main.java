package PaySystem;

import AtvNotificacao.Notificacao;

public class Main {
    public static void main(String[] args){
        Pagamento pagamento[] = new Pagamento[3];
        pagamento[0] = new PagamentoPix(19.99,"Detergente Ype", "1234");
        pagamento[1] = new PagamentoCartao(14.99, "Abobrinha", "9876");
        pagamento[2] = new PagamentoBoleto(24.99,"Parcela Ferrari", "1122");

        for(Pagamento p : pagamento){
            p.processarPagamento();
            IO.println();
        }
    }
}