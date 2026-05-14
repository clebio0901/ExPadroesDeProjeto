public class Paciente extends Participante{

    private String nome;

    public Paciente(MediadorClinica mediador, String nome) {
        super(mediador);
        this.nome = nome;
    }

    public String getNome() { return nome; }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println("Paciente " + nome + " ouviu: " + mensagem);
    }

}
