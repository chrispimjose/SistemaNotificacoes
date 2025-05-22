public class NotificacaoEmail implements Notificacao {
    // Notificação por e-mail
    private String destinatario;
    private String mensagem;
    private boolean foiEnviada;

    public NotificacaoEmail(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.foiEnviada = false;
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando e-mail para " + destinatario + ": " + mensagem);
        this.foiEnviada = true;
    }

    @Override
    public boolean verificarEnvio() {
        return foiEnviada;
    }

    @Override
    public String obterDestinatario() {
        return destinatario;
    }
}
