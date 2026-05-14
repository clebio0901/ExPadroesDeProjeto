public class Laboratorio extends Participante{

    public Laboratorio(MediadorClinica mediador) { super(mediador); }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Laboratório recebeu notificação: " + mensagem);
    }
}
