package AtvNotificacao;

public class PushNotfication extends Notificacao {

    public PushNotfication(String descricao, String aplicativo){
        super(descricao, aplicativo);
    }

    @Override
    public void exibirMensagem() {
        System.out.printf("===Push-Notificacao===\nAplicativo: %s\nMensagem: %s\n=================\n", getRemetente(), getDescricao());
    }
}
