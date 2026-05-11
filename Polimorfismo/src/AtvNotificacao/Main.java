package AtvNotificacao;

public class Main {
    public static void main(String[] args){
        Notificacao[] not = new Notificacao[3];
        not[0] = new Email("Mensagem enviada por email", "joel@gmail.com", "caua@gmail.com");
        not[1] = new Sms("Mensagem enviada por Sms", "64397213083", "64912367428");
        not[2] = new PushNotfication("Mensagem enviada por PushNotificacao", "Whatsapp");

        for(Notificacao n : not){
            n.exibirMensagem();
            IO.println();
        }
    }
}
