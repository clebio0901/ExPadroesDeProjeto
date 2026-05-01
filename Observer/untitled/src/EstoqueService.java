public class EstoqueService implements PedidoObserver {

    @Override
    public void atualizar(Pedido pedido){
       if(pedido.getStatus().equalsIgnoreCase("PAGO")){
           System.out.println("ESTOQUE: Reservado itens do pedido " + pedido.getId() );
       }else if(pedido.getStatus().equalsIgnoreCase("CANCELADO")){
           System.out.println("ESTOQUE: Devolvendo itens ao estoque do pedido" + pedido.getId());
       }
    }
}
