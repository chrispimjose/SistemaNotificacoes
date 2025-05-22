public class NotificacaoSMS implements Notificacao {
    private String numeroTelefone;
    private String mensagem;
    private boolean foiEnviada;

    public NotificacaoSMS(String numeroTelefone, String mensagem) {
        this.numeroTelefone = numeroTelefone;
        this.mensagem = mensagem;
        this.foiEnviada = false;
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando SMS para " + numeroTelefone + ": " + mensagem);
        this.foiEnviada = true;
    }

    @Override
    public boolean verificarEnvio() {
        return foiEnviada;
    }

    @Override
    public String obterDestinatario() {
        return numeroTelefone;
    }
}
