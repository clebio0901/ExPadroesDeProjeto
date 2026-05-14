public class Enfermagem extends Participante {

    public Enfermagem(MediadorClinica mediador) { super(mediador); }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Enfermagem recebeu notificação: " + mensagem);
    }
}
