//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Criando notificações
        Notificacao email = new NotificacaoEmail("usuario@exemplo.com", "Reunião agendada para amanhã");
        Notificacao sms = new NotificacaoSMS("+5511999999999", "Lembrete: Pagar conta");
        Notificacao push = new NotificacaoPush("ID123456", "Novo comentário no seu post");

        // Enviando notificações
        email.enviarMensagem();
        sms.enviarMensagem();
        push.enviarMensagem();

        // Verificando status de envio
        System.out.println("\nStatus de envio:");
        System.out.println("E-mail para " + email.obterDestinatario() + ": " + (email.verificarEnvio() ? "Enviado" : "Não enviado"));
        System.out.println("SMS para " + sms.obterDestinatario() + ": " + (sms.verificarEnvio() ? "Enviado" : "Não enviado"));
        System.out.println("Push para " + push.obterDestinatario() + ": " + (push.verificarEnvio() ? "Enviado" : "Não enviado"));
    }
}