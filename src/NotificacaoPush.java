public class NotificacaoPush implements Notificacao{
    private String idDispositivo;
    private String mensagem;
    private boolean foiEnviada;

    public NotificacaoPush(String idDispositivo, String mensagem) {
        this.idDispositivo = idDispositivo;
        this.mensagem = mensagem;
        this.foiEnviada = false;
    }

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando notificação push para dispositivo " + idDispositivo + ": " + mensagem);
        this.foiEnviada = true;
    }

    @Override
    public boolean verificarEnvio() {
        return foiEnviada;
    }

    @Override
    public String obterDestinatario() {
        return idDispositivo;
    }
}
