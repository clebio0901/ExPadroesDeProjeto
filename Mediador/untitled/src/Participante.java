public abstract class Participante {

    protected MediadorClinica mediador;

    public Participante(MediadorClinica mediador) {
        this.mediador = mediador;
    }

    public void enviarMensagem(String mensagem) {
        mediador.notificar(mensagem, this);
    }

    public abstract void receberMensagem(String mensagem);
}
