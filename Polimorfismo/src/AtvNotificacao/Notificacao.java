package AtvNotificacao;

public abstract class Notificacao {
    private String descricao;
    private String remetente;

    public Notificacao(String descricao, String remetente){
        this.descricao = descricao;
        this.remetente = remetente;
    }

    public abstract void exibirMensagem();

    public String getDescricao(){return descricao;}
    public String getRemetente(){return remetente;}
}
