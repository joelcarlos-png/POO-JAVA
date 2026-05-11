package AtvNotificacao;

public class Sms extends Notificacao{
    private String numeroCelular;

    public Sms(String descricao, String remetente, String numeroCelular){
        super(descricao, remetente);
        this.numeroCelular = numeroCelular;
    }

    @Override
    public void exibirMensagem() {
        System.out.printf("===Sms-Notificacao===\nRemetente: %s\nNumero receptor: %s\nMensagem: %s\n=================\n", getRemetente(), numeroCelular, getDescricao());
    }
}
