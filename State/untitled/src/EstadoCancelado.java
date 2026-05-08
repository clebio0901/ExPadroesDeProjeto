public class EstadoCancelado implements EstadoChamado{

    private  Chamado chamado;

    public  EstadoCancelado(Chamado chamado){
        this.chamado = chamado;
    }

    public EstadoCancelado() {

    }

    @Override
    public void iniciarAtendimento(Chamado chamado){
        System.out.println("Chamado cancelado, não pode ser Iniciado o atendimento");
    }
    @Override
    public void aguardarCliente(Chamado chamado){
        System.out.println("Chamado já cancelado, não á mais contato com o cliente.");
    }
    @Override
    public void responderCliente(Chamado chamado){
        System.out.println("Respondendo o Cliente: chamado cancelado ");
    }
    @Override
    public void resolver(Chamado chamado){
        System.out.println("Não é possível atender um chamado cancelado");
    }
    @Override
    public void cancelar(Chamado chamado){
        System.out.println("Cancelando o Chamado");
        chamado.setEstadoAtual(new EstadoCancelado(chamado));
    }
}
