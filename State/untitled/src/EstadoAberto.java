public class EstadoAberto implements EstadoChamado {

    @Override
    public void iniciarAtendimento(Chamado chamado){
        System.out.println("Iniciando o atendimento do Chamado.");
        chamado.setEstadoAtual(new EstadoEmAtendimento()); 
    }

    @Override
    public void aguardarCliente(Chamado chamado){
        System.out.println("Não é possível aguardar cliente de um chamado que nem começou a ser atendido.");
    }

    @Override
    public void responderCliente(Chamado chamado){
        System.out.println("Não é possível responder cliente em um chamado aberto.");
    }

    @Override
    public void resolver(Chamado chamado){
        System.out.println("Não é possível resolver um chamado que ainda está aberto.");
    }

    @Override
    public void cancelar(Chamado chamado){
        System.out.println("Cancelando o Chamado aberto.");
        chamado.setEstadoAtual(new EstadoCancelado());
    }
}
