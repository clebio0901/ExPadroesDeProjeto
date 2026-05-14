public class Medico extends Participante{

    public Medico(MediadorClinica mediador) { super(mediador); }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Médico recebeu notificação: " + mensagem);
    }
}
