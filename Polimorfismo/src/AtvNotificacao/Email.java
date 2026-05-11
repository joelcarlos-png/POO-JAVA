package AtvNotificacao;

public class Email extends Notificacao{
    private String email;

    public Email(String descricao, String remetente, String email){
        super(descricao, remetente);
        this.email = email;
    }

    @Override
    public void exibirMensagem() {
        System.out.printf("===Email-Notificacao===\nRemetente: %s\nEmail recptor: %s\nMensagem: %s\n=================\n", getRemetente(), email, getDescricao());
    }
}
