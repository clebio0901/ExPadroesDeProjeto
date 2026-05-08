public class EstadoAguardandoCliente implements EstadoChamado {

    private  Chamado chamado;

    public EstadoAguardandoCliente(Chamado chamado){
        this.chamado = chamado;
    }


    @Override
    public void iniciarAtendimento(Chamado chamado){
        System.out.println("Chamado já iniciado, aguardando cliente");
    }
    @Override
    public void aguardarCliente(Chamado chamado){
        System.out.println("Aguardando o cleinte para o Chamado");
        chamado.setEstadoAtual(new EstadoAguardandoCliente(chamado));
    }
    @Override
    public void responderCliente(Chamado chamado){
        System.out.println("Respondendo o Cliente ");
        chamado.setEstadoAtual(new EstadoEmAtendimento(chamado));
    }
    @Override
    public void resolver(Chamado chamado){
        System.out.println("Não é possível resolver um chamado aguardando pelo cliente.");
    }
    @Override
    public void cancelar(Chamado chamado){
        System.out.println("Cancelando o Chamado");
        chamado.setEstadoAtual(new EstadoCancelado(chamado));
    }
}
