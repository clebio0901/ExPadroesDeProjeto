public class Recepcao extends Participante {

    public Recepcao(MediadorClinica mediador) { super(mediador); }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Recepção recebeu notificação: " + mensagem);
    }
}
