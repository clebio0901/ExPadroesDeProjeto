public class EstadoEmAtendimento implements EstadoChamado{

    private  Chamado chamado;

    public EstadoEmAtendimento(Chamado chamado){
        this.chamado = chamado;
    }

    public EstadoEmAtendimento() {

    }

    @Override
    public void iniciarAtendimento(Chamado chamado){
        System.out.println("Em atendimento");
    }
    @Override
    public void aguardarCliente(Chamado chamado){
        System.out.println("Chamado já estar em atendimento");
        chamado.setEstadoAtual(new EstadoAguardandoCliente(chamado));
    }
    @Override
    public void responderCliente(Chamado chamado){
        System.out.println("O chamado já estar sendo executado");
        chamado.setEstadoAtual(new EstadoEmAtendimento(chamado));
    }
    @Override
    public void resolver(Chamado chamado){
        System.out.println("Chamdo resolvido");
        chamado.setEstadoAtual(new EstadoResolvido());
    }
    @Override
    public void cancelar(Chamado chamado){
        System.out.println("Cancelando o Chamado");
        chamado.setEstadoAtual(new EstadoCancelado(chamado));
    }
}
