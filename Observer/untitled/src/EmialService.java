public class EmialService implements PedidoObserver {

    @Override
    public void atualizar(Pedido pedido){
        System.out.println("EMAIL: Cleinte " + pedido.cliente.getNome() + " avisado sobre o status " + pedido.getStatus() ) ;
    }
}
